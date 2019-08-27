package project.coffeemachine2;

import java.util.*;
public class CoffeeMachine {

	public static void main(String[] args) {
		
		Action action = new Action();
		Action buy = new Buy();
		Action fill = new Fill();
		Action take = new Take();
		System.out.println(action);
		Scanner sc = new Scanner(System.in);
		System.out.println("Write action (buy, fill, take, remaining, exit): ");
		String options = sc.nextLine();
		
		do {
			if(options.equals("buy")) {
				System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
				String item = sc.nextLine();
				if(item.equals("1")) {
					((Buy)buy).elementNeeds(250 , 0, 16 ,1, 4);
				} else if(item.equals("2")) {
					((Buy)buy).elementNeeds(350 , 75, 20 ,1, 7);
				} else if(item.equals("3")) {
					((Buy)buy).elementNeeds(200 , 100, 12 ,1, 6);
				}
				//System.out.println(action);
			}
			else if(options.equals("fill")) {
				((Fill) fill).addElements();
				//System.out.println(action);
			}
			else if(options.equals("take")) {
				((Take) take).takeMoney();
				//System.out.println(action);
			}
			else if(options.equals("remaining")) {
				System.out.println(action);
			}
			else if(options.equals("exit")) {
				//System.out.println("exit");
				break;
			}
			System.out.println("Write action (buy, fill, take, remaining, exit):");
			options = sc.nextLine();
		}
		while(options.equals("buy") || options.equals("fill") || options.equals("take") || options.equals("remaining") || options.equals("exit"));
		
	}

}
