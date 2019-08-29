package project.budgetmanager;
import java.util.*;

public class Purchase  extends Action{
	void addPurchase() {	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose the type of purchase\n1) Food\n" + 
				"2) Clothes\n" + 
				"3) Entertainment\n" + 
				"4) Other\n" + 
				"5) Back");
		int purchaseType = scanner.nextInt();
		do {
			if(purchaseType == 5) {
				System.out.println();
				break;
			}
			addList(purchaseType);
			System.out.println("Choose the type of purchase\n1) Food\n" + 
						"2) Clothes\n" + 
						"3) Entertainment\n" + 
						"4) Other\n" + 
						"5) Back");
			purchaseType = scanner.nextInt();
			}
			while(purchaseType ==1 || purchaseType ==2 || purchaseType ==3 || purchaseType ==4 || purchaseType ==5);
		
	}
}
