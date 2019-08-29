package project.budgetmanager;
import java.util.*;
public class ShowPurchase extends Action{
	void showList() {
		Scanner sc = new Scanner(System.in);
		if(list.isEmpty()) {
			System.out.println("Purchase list is empty!\n");
		}else {
			System.out.println("Choose the type of purchases\n" + 
					"1) Food\n" + 
					"2) Clothes\n" + 
					"3) Entertainment\n" + 
					"4) Other\n" + 
					"5) All");
			int showItem = sc.nextInt();
			showItem(showItem);
		}
		
			
		/*
		if(super.list.isEmpty()) {
			System.out.println("Purchase list is empty\n");;
		}else {
			for(String s: super.list) {
				System.out.println(s);
			}
			System.out.println("Total sum: $" + super.totalSpend + "\nBalance: $" + totalIncome+ "\n");
		}
		
		*/
	}
}
