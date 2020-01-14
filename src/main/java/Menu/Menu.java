package Menu;

import java.util.Scanner;

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
				break;
			case 2:
				break;
			case 3:
				break;
			}
		} while (opcion!=0);
	}
}
