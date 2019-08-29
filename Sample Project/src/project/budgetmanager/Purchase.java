package project.budgetmanager;
import java.util.*;

public class Purchase  extends Action{
	void addPurchase() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter purchase name:");
		String item = scanner.nextLine();

		System.out.println("Enter its price:");
		double itemPrice = scanner.nextDouble();
		
		String str = item + " $" + itemPrice;
		super.list.add(str);
		
		super.totalIncome = super.totalIncome - itemPrice;
		super.totalSpend = super.totalSpend + itemPrice;
		System.out.println("Purchase was added!\n");
		
	}
}
