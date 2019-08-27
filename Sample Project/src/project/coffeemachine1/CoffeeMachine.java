package project.coffeemachine1;

import java.util.*;

public class CoffeeMachine {
    
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

        int water = Coffee.checkWater(waterAmount, waterNeeds, waterPerCoffee);
        int milk = Coffee.checkMilk(milkAmount, milkNeeds, milkPerCoffee);
        int coffeeBeans = Coffee.checkCoffeeBeans(coffeeBeansAmount, coffeeBeansNeeds, coffeeBeansPerCoffee);
        
        int[] array = {water, milk, coffeeBeans};
        int result = Coffee.sort(array);
        
        Coffee.printOutput(water, milk, coffeeBeans, result, coffeeAmount);
        
    }
}
