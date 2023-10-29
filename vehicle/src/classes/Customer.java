package classes;

import java.io.Serializable;
import java.time.LocalDate;

// customer id(int) ,first name, last name (string),email(string),password(string),registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
@SuppressWarnings("rawtypes")
public class Customer implements Comparable, Serializable{
	
	private int id ;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private double regamt;
	private LocalDate dob;
	private ServicePlan plan;
	static  int count;
	private LocalDate lastSubscriptionPaidDate;
	
	static {
		count=100;
	}
	public Customer( String fname, String lname, String email, String password, double regamt, LocalDate dob,
			ServicePlan plan) {
		super();
		this.id = count;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.regamt = regamt;
		this.dob = dob;
		this.plan = plan;
		count++;
		
	}
	public Customer(String email) {
		this.email=email;
		
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getRegamt() {
		return regamt;
	}
	public void setRegamt(double regamt) {
		this.regamt = regamt;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public ServicePlan getPlan() {
		return plan;
	}
	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}
	public LocalDate getLastSubscriptionPaidDate() {
		return lastSubscriptionPaidDate;
	}
	public void setLastSubscriptionPaidDate(LocalDate lastSubscriptionPaidDate) {
		this.lastSubscriptionPaidDate = lastSubscriptionPaidDate;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", password="
				+ password + ", regamt=" + regamt + ", dob=" + dob + ", plan=" + plan + "]";
	}
	@Override
	public int compareTo(Object o) {
		
		return this.email.compareTo(((Customer)o).getEmail());
	}
	
	
	
	

}
