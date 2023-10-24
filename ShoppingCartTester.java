Joel Castro (jcastro229@toromail.csudh.edu)

import java.util.Date;
import java.util.Scanner;


public class ShoppingCartTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ShoppingCart C = new ShoppingCart();
		System.out.print("DO you want to add or view your cart(A or V) ");
		char choice = input.next().charAt(0);
		while(choice =='A') {
			C.addItem();
			System.out.print("add or view your cart(A or V) ");
			choice = input.next().charAt(0);
		}
		while(choice =='V') {
			
			C.viewCart();
			System.out.print("add or view your cart(A or V) ");
			choice = input.next().charAt(0);
		}
		
		//SimpleDateFormat df = new SimpleDateFormat(C.PATTERN);
		
		//Date sellBy;
		//Date useBy;
		
		
		//addItem to Shopping CArt
		
		//View Shopping Cart
		
		/*if(C.type=='P') {
			System.out.print("Name of the author? ");
			C.author = input.next();
			System.out.print("What month was this published? ");
			C.month = input.next();
			System.out.print("How many pages? ");
			C.numOfPages = input.nextInt();
		}
		else if(C.type=='F') {
			System.out.print("What is the sell by date? day(01-31),Month(01-12),Year(00-99) ");
			C.PATTERN= input.next();
			try {
				sellBy = df.parse(C.PATTERN);
			}catch(ParseException e) {
				
			}
			System.out.print("What is the use by date? day(01-31),Month(01-12),Year(00-99) ");
			C.PATTERN = input.next();
			try {
				useBy =df.parse(C.PATTERN);
			}catch(ParseException e){
				
			}
		}
		else {
			
		}
		System.out.print(sellBy);*/
		
	}
	
			
		
	
	public void itemCount(){//- It can tell how many items it holds
		
	
		}
	public void totalCost() {//- It can calculate total cost of items inside it including tax
		
		
	}
	public void printAll() {//- It can print all items the are inside the cart 
		//including their price, tax andtotal
		
	}
}

