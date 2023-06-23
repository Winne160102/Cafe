package Caffe;

import java.util.Scanner;

public class Bill {
	//attributes
	private String idBill;
	private String zone;
	private String nameDrink;
	private String quantity;
	private String unitPrice; // đơn giá
	private String amount; // thành tiền
	private String total;
	
	//constructor
	public Bill() {
	}
	
	//constructor all
	public Bill(String idBill, String zone, String nameDrink, String quantity, String unitPrice, String amount, String total) {
		this.idBill = idBill;
		this.zone = zone;
		this.nameDrink = nameDrink;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.amount = amount;
		this.total = total;
	}
	
	//set attributes
	public void setidBill(String idBill) {
		this.idBill = idBill;
	}
	public void setzone(String zone) {
		this.zone = zone;
	}
	public void setnameDrinks(String nameDrink) {
		this.nameDrink = nameDrink;
	}
	public void setquantity(String quantity) {
		this.quantity = quantity;
	}
	public void setamount(String amount) {
		this.amount = amount;
	}
	public void settotal(String total) {
		this.total = total;
	}
	
	//set all attributes
	public void setall(String idBill, String zone, String nameDrink, String quantity, String unitPrice, String amount, String total) {
		this.idBill = idBill;
		this.zone = zone;
		this.nameDrink = nameDrink;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.amount = amount;
		this.total = total;
	}
	
	//get attributes
	public String getidBill() {
		return this.idBill;
	}
	public String getzone() {
		return this.zone;
	}
	public String getnameDrink() {
		return this.nameDrink;
	}
	public String getquantity() {
		return this.quantity;
	}
	public String getunitPrice() {
		return this.unitPrice;
	}
	public String getamount() {
		return this.amount;
	}
	public String gettotal() {
		return this.total;
	}
	
	//input
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Import ID Bill: ");
		this.idBill = sc.nextLine();

		System.out.println("Import Zone: ");
		this.zone = sc.nextLine();
		
		System.out.println("Import Name Drink: ");
		this.nameDrink = sc.nextLine();
		
		System.out.println("Import Quantity: ");
		this.quantity = sc.nextLine();
		
		System.out.println("Import Unit Price: ");
		this.unitPrice = sc.nextLine();
		
		System.out.println("Import Amount: ");
		this.amount = sc.nextLine();
		
		System.out.println("Import Total: ");
		this.total = sc.nextLine();
		
		sc.close();
	}
	
	public void output() {
		System.out.println("ID Bill: " + getidBill());
		
		System.out.println("Zone: " + getzone());
		
		System.out.println("Name Drink: " + getnameDrink());
		
		System.out.println("Quantity: " + getquantity());
		
		System.out.println("Unit Price: " + getunitPrice());
		
		System.out.println("Amount: " + getamount());
		
		System.out.println("Total: " + gettotal());
	}
}
