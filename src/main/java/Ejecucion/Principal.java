package Ejecucion;

import java.sql.Connection;
import java.text.ParseException;

import GestionDB.Conexion;
import Interfaces.ParametrosConexion;
import Menu.Menu;

public class Principal {
	public static void main(String[] args) throws ParseException {
		//Creamos la Conexion 
		Conexion c = new Conexion();
		Connection conn =null;
		conn = c.conexion(ParametrosConexion.url, ParametrosConexion.user, ParametrosConexion.password);
		Menu m = new Menu();
		m.Menu(conn);
	}
}
