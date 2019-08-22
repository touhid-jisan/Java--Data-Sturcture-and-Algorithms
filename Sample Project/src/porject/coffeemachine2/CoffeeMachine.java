package porject.coffeemachine2;

import java.util.*;
public class CoffeeMachine {

	public static void main(String[] args) {
		
		Action action = new Action();
		Action buy = new Buy();
		Action fill = new Fill();
		Action take = new Take();
		System.out.println(action);
		Scanner sc = new Scanner(System.in);
		System.out.println("Write action (buy, fill, take): ");
		String options = sc.nextLine();
		
		switch(options) {
		case "buy" :
			
			System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino");
			int coffeeType = sc.nextInt();
			switch(coffeeType) {
			case 1:
				((Buy)buy).ellementNeeds(250 , 0, 16 , 4);
				break;
			case 2: 
				((Buy)buy).ellementNeeds(350 , 75, 20 , 7);
				break;
			case 3: 
				((Buy)buy).ellementNeeds(200 , 100, 12 , 6);
				break;
			}
			System.out.println(buy);
			break;
			
		case "fill" :
			((Fill) fill).addElements();
			System.out.println(fill);
			break;
			
		case "take" :
			((Take) take).takeMoney();
			System.out.println(take);
			break;
			
		}
	}

}
