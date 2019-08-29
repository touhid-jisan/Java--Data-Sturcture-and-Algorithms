package project.budgetmanager;
import java.util.*;
public class Income extends Action{
	void addIncome() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter income:");
		int income = sc.nextInt();
		super.setIncome(income);
		System.out.println("Income was added!\n");
	}
}
