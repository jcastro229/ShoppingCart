Joel Castro (jcastro229@toromail.csudh.edu)

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;

public class ShoppingCart {
	Scanner input = new Scanner(System.in);
	
	ArrayList<String> items = new ArrayList<String>();
	ArrayList<Double> totals= new ArrayList<Double>();
	String name="";//inventory item
	String vendor=""; //name of vendor for product
	double price; //Amount that the customer pays
	double cost;//cost to acquire item, amount store pays
	double weight; //stores weight of a single item
	double taxRate; //percentage of tax charged on item
	char type;//select type using one character, P, F, or G
	String author;
	String month;
	int numOfPages;
	public static final String PATTERN="dd-MM-yy";
	Date sellBy;
	Date useBy;
	int i;
	double total;
	double totalPrice;
	
	SimpleDateFormat df = new SimpleDateFormat(PATTERN);
	
	public void addItem() {
		System.out.print("Type of Item(P- publication, F - food, G - regular- ");
		type = input.next().charAt(0);
		//Add inputs for all different variables
		System.out.print("Name of Item -");
		input.nextLine();
		name = input.nextLine();
		System.out.print("Name of Item Vendor-");
		
		vendor = input.nextLine();
		System.out.print("Price of Item- ");
		price = input.nextDouble();
		System.out.print("Cost of Item for Store- ");
		cost = input.nextDouble();
		System.out.print("Weight of Item- ");
		weight = input.nextDouble();
		System.out.print("tax rate of Item- ");
		taxRate = input.nextDouble();
		total = (price*(1)+(price*taxRate));
		totals.add(total);
		
		
			if(type=='P') {
				System.out.print("Name of the author? ");
				input.nextLine();
				author = input.nextLine();
				System.out.print("What month was this published? ");
				month = input.next();
				System.out.print("How many pages? ");
				numOfPages = input.nextInt();
				items.add(name+" "+vendor+" "+price+" "+cost+" "+weight+" "+taxRate+" "+author+" "+month+" "+numOfPages);
				i++;
			}
			else if(type=='F') {
				try {
				System.out.print("What is the sell by date? day(01-31)-Month(01-12)-Year(00-99) ");
				sellBy = df.parse(input.next());
				System.out.println(sellBy);
				i++;
				}catch(ParseException e) {
					System.out.println("Wrong Format");
				}
				try {
				System.out.print("What is the use by date? day(01-31),Month(01-12),Year(00-99) ");
				useBy = df.parse(input.next());
				System.out.println(useBy);
				}catch(ParseException e) {
					System.out.println("Wrong Format");
				}
				items.add(name+" "+vendor+" "+price+" "+cost+" "+weight+" "+taxRate+" "+sellBy+" "+useBy);
			}
			else {
				items.add(name+" "+vendor+" "+price+" "+cost+" "+weight+" "+taxRate);
				i++;
			}
			
			
	}
	public void viewCart() {
		System.out.print("I - See how many items are in the cart, T - See Total cost, R - see all items with total? ");
		char ans = input.next().charAt(0);
		if(ans=='I') {
			System.out.println("Total Items in Cart: "+(i)+"\n\n");
		}
		else if(ans=='T') {
			for(int a =0;a<i;a++) {
				totalPrice = totals.get(a)+totalPrice;
			}
			System.out.println("Total cost of your items is "+totalPrice);
		}
		else if(ans=='R') {
			for(int a =0;a<i-1;a++) {
				System.out.println(items.get(a));
				System.out.println(totals.get(a));
			}
		}
			
			
		}
		/*It can tell how many items it holds
- It can calculate total cost of items inside it including tax
- It can print all items the are inside the cart including their price, tax and
total.*/
	}

/*The food item will have “sell by” and “use by” dates 
in addition to all fields that an item has.

The general grocery item is just like a regular item.
The shopping cart will have the following features.
- It can tell how many items it holds
- It can calculate total cost of items inside it including tax
- It can print all items the are inside the cart including their price, tax and
total.

Code (25 credits):
Submit working code. Create the classes and a Driver class with menu to accept
user input.
*/
	