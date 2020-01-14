package Modelos;

public class Departamentos {
	private int department_id;
	private String department_name,department_location;
	//Getters
	public int getDepartment_id() {
		return department_id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public String getDepartment_location() {
		return department_location;
	}
	//Setters
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public void setDepartment_location(String department_location) {
		this.department_location = department_location;
	}
	//To String
	@Override
	public String toString() {
		return "Departamentos --> department_id=" + department_id + ", department_name=" + department_name
				+ ", department_location=" + department_location;
	}
	
	
}
