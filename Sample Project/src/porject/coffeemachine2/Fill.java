package porject.coffeemachine2;

import java.util.*;
public class Fill extends Action{
	
	public void addElements() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write how many ml of water do you want to add: ");
		int addWater = sc.nextInt();
		setWater(addWater+super.waterHas);
		
		
		System.out.println("Write how many ml of milk do you want to add: ");
		int addMilk = sc.nextInt();
		setMilk(addMilk+super.milkHas);
		
		System.out.println("Write how many grams of coffee beans do you want to add: ");
		int addCoffeeBeans = sc.nextInt();
		setCoffeeBeans(beansHas + addCoffeeBeans);
		
		System.out.println("Write how many disposable cups of coffee do you want to add: ");
		int addCup = sc.nextInt();
		setCup( cupHas + addCup);
		
		
	}
}
