package Caffe;

import java.util.Scanner;

public class Personel extends People {
	//attributes
	private String duty;
	private String wage;
	private String worktime;
	
	//constructor
	public Personel() {
		super();
	}
	 
	//construcor all attributes
	public Personel(String name, String id, String sex, String phoneNum, String address, String birthday, String duty, String wage, String worktime) {
		super(name, id, sex, phoneNum, address, birthday);
		this.duty = duty;
		this.wage = wage;
		this.worktime = worktime;
	}
	
	//set attributes
	public void setduty(String duty) {
		this.duty = duty;
	}
	public void setwage(String wage) {
		this.wage = wage;
	}
	public void setworktime(String worktime) {
		this.worktime = worktime;
	}
	
	//set all attributes
	public void setall(String name, String id, String sex, String phoneNum, String address, String birthday, String duty, String wage, String worktime) {
		super.setall(name, id, sex, phoneNum, address, birthday);
		this.duty = duty;
		this.wage = wage;
		this.worktime = worktime;
	}
	
	//get
	public String getduty() {
		return duty;
	}
	public String getwage() {
		return wage;
	}
	public String getworktime() {
		return worktime;
	}
	
	//input
	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		
		System.out.println("Import Duty: ");
		duty = sc.nextLine();
		
		System.out.println("Import Wage: ");
		wage = sc.nextLine();
		
		System.out.println("Import Worktime: ");
		worktime = sc.nextLine();
		
		sc.close();
	}
	
	//output
	public void output() {
		super.output();
		System.out.println("Duty: " + getduty());
		System.out.println("Wage: " + getwage());
		System.out.println("Worktime: " + getworktime());
	}
}
