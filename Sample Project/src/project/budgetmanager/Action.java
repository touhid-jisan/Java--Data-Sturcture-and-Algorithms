package project.budgetmanager;
import java.util.*;
public class Action {
	static double totalIncome;
	static double foodCost;
	static double clothCost;
	static double entertainmentCost;
	static double otherCost;
	static double totalCost;
	
	static List<String> list = new ArrayList<String>();
	static List<String> foodList = new ArrayList<String> ();
	static List<String> clothList = new ArrayList<String> ();
	static List<String> entertainmentList = new ArrayList<String> ();
	static List<String> otherList = new ArrayList<String> ();
	static double totalSpend ;
	
	void setIncome(double income) {
		this.totalIncome  = income;
	}
	static void showBalance() {
		System.out.println("Balance: $" + totalIncome);
	}
	void addList(int i) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter purchase name:");
		String itemName = sc.nextLine();
		System.out.println("Enter its price:");
		double itemPrice = sc.nextDouble();
		String str = itemName + " $" + itemPrice;
		
		if(i==1) {
			foodList.add(str);
			this.foodCost = this.foodCost + itemPrice;
			this.totalCost = this.totalCost +itemPrice;
			System.out.println("Purchase was added! \n");
		}else if(i==2) {
			clothList.add(str);
			this.clothCost = this.clothCost + itemPrice;
			this.totalCost = this.totalCost + itemPrice;
			System.out.println("Purchase was added! \n");
		}else if(i==3) {
			entertainmentList.add(str);
			this.entertainmentCost = this.entertainmentCost + itemPrice;
			this.totalCost = this.totalCost + itemPrice;
			System.out.println("Purchase was added! \n");
		}else if(i==4) {
			otherList.add(str);
			this.otherCost = this.otherCost + itemPrice;
			this.totalCost = this.totalCost + itemPrice;
			System.out.println("Purchase was added! \n");
		}
		list.add(str);
		
	}
	void showItem(int i) {
		if(i==1) {
			if(foodList.isEmpty()) {
				System.out.println("\nFood:\nPurchase list is empty!\n");
			}else {
				System.out.println("\nFood:");
				for(String s: foodList) {
					System.out.println(s);
				}
				System.out.println("Total sum: " +foodCost + "\n");
			}
		}
		else if(i==2) {
			if(clothList.isEmpty()) {
				System.out.println("\nCloth:\nPurchase list is empty!\n");
			}else {
				System.out.println("\nCloths:");
				for(String s: clothList) {
					System.out.println(s);
				}
				System.out.println("Total sum: " +clothCost + "\n");
			}
		}else if(i==3) {
			if(entertainmentList.isEmpty()) {
				System.out.println("\nEntertainment:\nPurchase list is empty!\n");
			}else {
				System.out.println("\nEntertainment:");
				for(String s: entertainmentList) {
					System.out.println(s);
				}
				System.out.println("Total sum: " +entertainmentCost + "\n");
			}
		}else if(i==4) {
			if(otherList.isEmpty()) {
				System.out.println("\nOther:\nPurchase list is empty!\n");
			}else {
				System.out.println("\nOther:");
				for(String s: otherList) {
					System.out.println(s);
				}
				System.out.println("Total sum: " +otherCost + "\n");
			}
		}else if(i==5) {
			System.out.println("\nAll:");
			for(String s: list) {
				System.out.println(s);
			}
			System.out.println("Total sum: " +totalCost + "\n");
		}
	}
}
