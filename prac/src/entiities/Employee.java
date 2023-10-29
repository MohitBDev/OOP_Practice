package entiities;

import java.io.Serializable;
import java.time.LocalDate;

@SuppressWarnings({ "serial", "rawtypes" })
public class Employee implements Comparable,Serializable{
	private int id;
	private String firstname;
	private  String lastname;
	private LocalDate joiningdate;
	private double salary;
   private static int idcnt;
   static {
	   idcnt=1;
   }
	public Employee( String firstname, String lastname, String joiningdate, double salary) {
		super();
		this.id = idcnt;
		this.firstname = firstname;
		this.lastname = lastname;
		this.joiningdate = LocalDate.parse(joiningdate);
		this.salary = salary;
		idcnt++;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public LocalDate getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(LocalDate joiningdate) {
		this.joiningdate = joiningdate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", joiningdate="
				+ joiningdate + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Object o) {
		
		return this.firstname.compareTo(((Employee)o).getFirstname());
	}
	
	

}
