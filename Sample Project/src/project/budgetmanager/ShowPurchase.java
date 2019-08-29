package project.budgetmanager;

public class ShowPurchase extends Action{
	void showList() {
		if(super.list.isEmpty()) {
			System.out.println("Purchase list is empty\n");;
		}else {
			for(String s: super.list) {
				System.out.println(s);
			}
			System.out.println("Total sum: $" + super.totalSpend + "\nBalance: $" + totalIncome+ "\n");
		}
		
		
	}
}
