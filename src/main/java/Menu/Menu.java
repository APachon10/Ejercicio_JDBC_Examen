package Menu;

import java.sql.Connection;
import java.util.Scanner;

import GestionDB.Querys;
import Modelos.Departamentos;

public class Menu {
	public void Menu() {
		Scanner scan = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.print("Escoge una Opcion:");
			System.out.println("========================");
			System.out.println("1 - Insertar Departamento "
					+ "\n2 - Igualar Comision Vendedores al importe introducido "
					+ "\n3 - Listar Empleados segun el Departamento");
			System.out.println("========================");
			System.out.print("Opcion: ");
			opcion = scan.nextInt();
			
			switch (opcion) {
			case 1:
				Scanner scan2 = new Scanner(System.in);
				Departamentos d = new Departamentos();
				System.out.print("Id del Departamento: ");
				d.setDepartment_id(scan2.nextInt());			
				d.setDepartment_name("DEVOPS");
				break;
			case 2:
				break;
			case 3:
				break;
			}
		} while (opcion!=0);
	}
	public void insertarDepartmenDirectAccess(Departamentos d, Connection conn) {
		Scanner scan2 = new Scanner(System.in);
		Querys q = new Querys();
		q.insertDepartaments(d, conn);
	}
}
