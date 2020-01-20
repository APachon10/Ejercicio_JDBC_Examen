package GestionDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import Interfaces.ParametrosConexion;
import Modelos.Departamentos;
import Modelos.Empleados;

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
	public void insertEmployee(Empleados e,Connection conn,String department_name) {
		try {
			PreparedStatement ps = conn.prepareStatement("insert into empleados values(?,?,?,?,?,?,?,?)");
			
			ps.setInt(1, e.getEmployee_id());
			ps.setString(2, e.getEmployee_surname());
			ps.setString(3, e.getEmployee_position());
			ps.setInt(4, e.getDir());
			ps.setDate(5,(Date) e.getInitialDate());
			ps.setFloat(6, e.getSalary());
			ps.setFloat(7, e.getCommission());
			
			
			ResultSet rs = selectIdDepartamento(department_name, conn);
			try {
				if(rs.next()) {
					int id = ((Number) rs.getObject(1)).intValue();
					e.setDepartment_number(id);
					ps.setInt(8,e.getDepartment_number());
					ps.executeUpdate();
				}else {
					System.out.println("No existe el Departamentos que has seleccionado ");
				}
			} catch (SQLException e1) {
				System.out.println("Error: ");
				System.out.println("======================");
				e1.printStackTrace();
			}
			
		} catch (Exception e1) {
			System.out.println("Error: ");
			System.out.println("======================");
			e1.printStackTrace();
		}
	}
	public void igualarComisionImporteIntroducido(float importe_introducido , Connection conn) {
		System.out.println("Hola");
		try {
			//Llamamos al Procedimiento para insertar jugadores
			CallableStatement cs = conn.prepareCall("{call  igualarComisionImpIntro(?)}");
			cs.setFloat(1, importe_introducido);
			cs.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Error");
			System.out.println("=================");
			e.printStackTrace();
		}
	}
	public void listarEmpleadoxDepartamento(String department_name , Connection conn) {
		System.out.println("Hola");
		try {
			//Llamamos al Procedimiento para insertar jugadores
			CallableStatement cs = conn.prepareCall("{call   consultaEmpleadosDepartamento(?)}");
			cs.setString(1, department_name);
			cs.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error");
			System.out.println("=================");
			e.printStackTrace();
		}
	}
	
	//Selects
	public ResultSet selectIdDepartamento(String department_name,Connection conn) {
		ResultSet rs = null;
		try {
			PreparedStatement ps = conn.prepareStatement("select dept_no from departamentos where dnombre = "+ "'"+ department_name +"'");
			rs = ps.executeQuery();
		} catch (Exception e) {
			System.out.println("Error! ");
			System.out.println("==================");
			e.printStackTrace();
		}
		return rs;
	}
}
