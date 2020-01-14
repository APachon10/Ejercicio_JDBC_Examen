package GestionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import Interfaces.ParametrosConexion;
import Modelos.Departamentos;

public class Querys implements ParametrosConexion{
	public void insertDepartaments(Departamentos d,Connection conn) {
		try {
			PreparedStatement ps = conn.prepareStatement("insert into departamentos values(?,?,?)");
			ps.setInt(1, d.getDepartment_id());
			ps.setString(2, d.getDepartment_name());
			ps.setString(3, d.getDepartment_location());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error: ");
			System.out.println("======================");
			e.printStackTrace();
		}
	}
}
