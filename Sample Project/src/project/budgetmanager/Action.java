package project.budgetmanager;
import java.util.*;
public class Action {
	static double totalIncome;
	static List<String> list = new ArrayList<String>();
	static double totalSpend ;
	
	void setIncome(int income) {
		this.totalIncome  = income;
	}
	static void showBalance() {
		System.out.println("Balance: $" + totalIncome);
	}
}
