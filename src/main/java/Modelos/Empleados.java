package Modelos;

import java.sql.Date;

public class Empleados {
	private int employee_id;
	private String employee_surname,employee_position;
	private int dir;
	private Date initialDate;
	private float salary,commission;
	private int department_number;
	//Getters 
	public int getEmployee_id() {
		return employee_id;
	}
	public String getEmployee_surname() {
		return employee_surname;
	}
	public String getEmployee_position() {
		return employee_position;
	}
	public int getDir() {
		return dir;
	}
	public Date getInitialDate() {
		return initialDate;
	}
	public float getSalary() {
		return salary;
	}
	public float getCommission() {
		return commission;
	}
	public int getDepartment_number() {
		return department_number;
	}
	//Setters
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public void setEmployee_surname(String employee_surname) {
		this.employee_surname = employee_surname;
	}
	public void setEmployee_position(String employee_position) {
		this.employee_position = employee_position;
	}
	public void setDir(int dir) {
		this.dir = dir;
	}
	public void setInitialDate(Date initialDate) {
		this.initialDate = initialDate;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void setCommission(float commission) {
		this.commission = commission;
	}
	public void setDepartment_number(int department_number) {
		this.department_number = department_number;
	}
	//To String
	@Override
	public String toString() {
		return "Empleados --> employee_id=" + employee_id + ", employee_surname=" + employee_surname
				+ ", employee_position=" + employee_position + ", dir=" + dir + ", initialDate=" + initialDate
				+ ", salary=" + salary + ", commission=" + commission + ", department_number=" + department_number;
	}
	
	
}
