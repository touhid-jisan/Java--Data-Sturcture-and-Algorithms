package project.coffeemachine2;

public class Buy extends Action{
	public void elementNeeds(int waterNeed, int milkNeed, int beansNeed,int cupNeed, int moneyCost) {
		 
		
		if(waterNeed<= super.waterHas && milkNeed <= super.milkHas && beansNeed <= beansHas) {
			System.out.println("I have enough resources, making you a coffee!");
			setWater(super.waterHas-waterNeed);
			setMilk(super.milkHas - milkNeed);
			setCoffeeBeans(super.beansHas - beansNeed);
			setMoney(super.moneyHas+moneyCost);
			setCup(super.cupHas-1);
		}
		else {
			System.out.println("Not Enough Resources, Please Fill");
		}
	}
}