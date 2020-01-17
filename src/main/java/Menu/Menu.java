package Menu;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import GestionDB.Conexion;
import GestionDB.Querys;
import Interfaces.ParametrosConexion;
import Modelos.Departamentos;
import Modelos.Empleados;

public class Menu implements ParametrosConexion{
	public void Menu(Connection conn) throws ParseException {
		Scanner scan = new Scanner(System.in);
		int opcion = 0;
		Querys q = new Querys();
		do {
			System.out.print("Escoge una Opcion:");
			System.out.println("========================");
			System.out.println("1 - Insertar Departamento "
					+ "\n2 - Insertar Empleado"
					+ "\n3 - Igualar Comision Vendedores al importe introducido "
					+ "\n4 - Listar Empleados segun el Departamento"
					+ "\n0 - Salir ");
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
				
				System.out.print("Localizacion del Departamento:");
				d.setDepartment_location(scan2.next());
				
				q.insertDepartaments(d, conn);
				break;
			case 2:
				Scanner scan3 = new Scanner(System.in);
				
				Empleados e = new Empleados();
				
				e.setEmployee_id(7411);
				e.setEmployee_surname("J López");
				e.setEmployee_position("Program");
				e.setDir(7450);
				
				String fecha = "1990-12-02";
				java.sql.Date fechaFinal = java.sql.Date.valueOf(fecha);
				e.setInitialDate(fechaFinal);
				
				e.setSalary(1500);
				e.setCommission(3900);
				
				String department_name = "";
				System.out.print("A que Departamento Pertenece el Empleado: ");
				department_name = scan3.next();
				
				q.insertEmployee(e, conn, department_name);
				break;
			case 3:
				Scanner scan24 = new Scanner(System.in);
				int importe = 0;
				System.out.print("Introduce el importe: ");
				
				importe = scan24.nextInt();
				q.igualarComisionImporteIntroducido(importe, conn);
				break;
			}
		} while (opcion!=0);
	}
}
