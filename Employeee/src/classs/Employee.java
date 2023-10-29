package classs;

import java.io.Serializable;
import java.time.LocalDate;

// id(string), first name , last name , dept(ENUM), joining date(LocalDate),salary
public class Employee implements Comparable,Serializable{
	private int id;
	private String fname;
	private String lname;
	private  Dept dept;
	private LocalDate joindate;
	private double salary;
	private static int counter;
	static {
		counter=100;
	}
	
	
	
	public Employee(int id, String fname, String lname, Dept dept, LocalDate joindate, double salary) {
		super();
		this.id =counter ;
		this.fname = fname;
		this.lname = lname;
		this.dept = dept;
		this.joindate = joindate;
		this.salary = salary;
		counter++;
	}
 public Employee(String fname) {
	 this.fname=fname;
 }


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public Dept getDept() {
		return dept;
	}



	public void setDept(Dept dept) {
		this.dept = dept;
	}



	public LocalDate getJoindate() {
		return joindate;
	}



	public void setJoindate(LocalDate joindate) {
		this.joindate = joindate;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", dept=" + dept + ", joindate="
				+ joindate + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Object o) {
		
		return ((Double)this.salary).compareTo(((Employee)o).getSalary());
	}
	
	

}
