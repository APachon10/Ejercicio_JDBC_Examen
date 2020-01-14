package GestionDB;

import java.sql.Connection;
import java.sql.DriverManager;

import Interfaces.ParametrosConexion;

public class Conexion implements ParametrosConexion{
	public Connection conexion (String url,String user,String password) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(ParametrosConexion.url,ParametrosConexion.user,ParametrosConexion.password);
			System.out.println("Conectado con exito ");
		} catch (Exception e) {

		}
		return conn;
	}
}
