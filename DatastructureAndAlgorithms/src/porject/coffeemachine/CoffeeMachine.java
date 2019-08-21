package porject.coffeemachine;

import java.util.*;

public class CoffeeMachine {

    public static int checkWater(int waterAmount, int waterNeeds, int waterPerCoffee) {
        if(waterAmount >= waterPerCoffee) {
            return (waterAmount / waterPerCoffee);
        }
        else {
            return 0;
        }
    }
    public static int checkMilk(int milkAmount, int milkNeeds, int milkPerCoffee) {
        if(milkAmount >= milkPerCoffee) {
            return (milkAmount / milkPerCoffee);
        }
        else {
            return 0;
        }
    }
    public static int checkCoffeeBeans(int coffeeBeansAmount, int coffeeBeansNeed, int coffeeBeansPerCoffee) {
        if(coffeeBeansAmount >= coffeeBeansPerCoffee) {
            return coffeeBeansAmount / coffeeBeansPerCoffee;
        }
        else {
            return 0;
        }
    }
    public static int sort(int array[]) {
    	int min = array[0];
    	for(int i=1; i<array.length; i++) {	
    		if(array[i] < min) {
    			min = array[i];
    		}
    	}
    	return min;
    }
    public static void printOutput(int water, int milk, int coffeeBeans, int result, int coffeeAmount) {
    	if(water ==0 && milk ==0 && coffeeBeans ==0) {
        	System.out.println("Yes, I can make that amount of coffee");
        } else if(water == 0 || milk ==0 || coffeeBeans ==0) {
        	System.out.println("No, I can make only 0 cup(s) of coffee");
        } else if(result < coffeeAmount) {
        	System.out.println("No, I can make only "+ result +" cup(s) of coffee");
        } else if (result > coffeeAmount) {
        	System.out.println("Yes, I can make that amount of coffee (and even " +(result-coffeeAmount)+ " more than that)");
        } else {
        	System.out.println("Yes, I can make that amount of coffee");
        }
    }
    
    public static void main(String[] args) {
        int waterPerCoffee = 200;
        int milkPerCoffee = 50;
        int coffeeBeansPerCoffee = 15;
        
        int waterAmount, milkAmount, coffeeBeansAmount, coffeeAmount;
        
        int waterNeeds, milkNeeds, coffeeBeansNeeds;

        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has: ");
        waterAmount = sc.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        milkAmount = sc.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        coffeeBeansAmount = sc.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        coffeeAmount = sc.nextInt();

        waterNeeds = waterPerCoffee * coffeeAmount;
        milkNeeds = milkPerCoffee * coffeeAmount;
        coffeeBeansNeeds = coffeeBeansPerCoffee * coffeeAmount;

        int water = checkWater(waterAmount, waterNeeds, waterPerCoffee);
        int milk = checkMilk(milkAmount, milkNeeds, milkPerCoffee);
        int coffeeBeans = checkCoffeeBeans(coffeeBeansAmount, coffeeBeansNeeds, coffeeBeansPerCoffee);
        
        int[] array = {water, milk, coffeeBeans};
        int result = sort(array);
        
        printOutput(water, milk, coffeeBeans, result, coffeeAmount);
        
        
        System.out.println(result);
        System.out.println("Water : " + water );
        System.out.println("milk : " + milk );
        System.out.println("coffeebeans : " + coffeeBeans );

        
       // makeCoffee(waterAmount, milkAmount, coffeeAmount, waterNeeds, milkNeeds, coffeeBeansNeeds, coffee);
    }
}
