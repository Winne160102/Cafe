package Caffe;

import java.util.Scanner;

public class Drinking {
	//attributes
	private String name;
	private String type;
	private String id;
	private float price;
	
	//constructor
	public Drinking() {
		
	}
	
	//constructor all attributes
	public Drinking(String name, String id, String type, float price) {
		this.name = name;
		this.id = id;
		this.type = type;
		this.price = price;
	}
	
	//set attributes
	public void setname(String name) {
		this.name = name;
	}
	public void setid(String id) {
		this.id = id;
	}
	public void settype(String type) {
		this.type = type;
	}
	public void setprice(float price) {
		this.price = price;
	}
	
	//set all attributes
	public void setall(String name, String id, String type, float price) {
		this.name = name;
		this.id = id;
		this.type = type;
		this.price = price;
	}
	
	//get
	public String getname() {
		return this.name;
	}
	
	public String getid() {
		return this.id;
	}
	public String gettype() {
		return this.type;
	}
	public float getprice() {
		return this.price;
	}
	
	//input
	public void input() {
		Scanner sc = new Scanner(System.in);
		
}
