package porject.coffeemachine1;

public class Coffee {

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
}
