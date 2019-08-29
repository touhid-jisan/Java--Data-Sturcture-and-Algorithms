package project.budgetmanager;
import java.util.*;

public class BudgetManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Action action = new Action();
		Action income = new Income();
		Action showPurchase = new ShowPurchase();
		Action purchase = new Purchase();
		Action balance = new Balance();
		System.out.println("Choose your action:");
		
		System.out.println("1) Add income\n" + 
				"2) Add purchase\n" + 
				"3) Show list of purchases\n" + 
				"4) Balance\n" + 
				"0) Exit");
		int go = sc.nextInt();
		do {
			System.out.println();
			if(go == 0) {
				System.out.print("Bye!");
				break;
			}
			else if(go==1) {
				((Income)income).addIncome();
			}
			else if(go == 2) {
				((Purchase) purchase).addPurchase();
			}
			else if(go ==3) {
				((ShowPurchase) showPurchase).showList();
			}
			else if(go == 4) {
				((Balance)balance).showBalance();
			}

			System.out.println("Choose your action:");
			System.out.println("1) Add income\n" + 
					"2) Add purchase\n" + 
					"3) Show list of purchases\n" + 
					"4) Balance\n" + 
					"0) Exit");
			go = sc.nextInt();
		}
		while( go ==0 || go ==1 || go ==2 || go ==3 || go ==4 );
		
	}

}
