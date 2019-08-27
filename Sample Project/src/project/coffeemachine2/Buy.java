package porject.coffeemachine2;

public class Buy extends Action{
	public void ellementNeeds(int waterNeed, int milkNeed, int beansNeed, int moneyCost) {
		setWater(super.waterHas-waterNeed);
		setMilk(super.milkHas - milkNeed);
		setCoffeeBeans(super.beansHas - beansNeed);
		setMoney(super.moneyHas+moneyCost);
		setCup(super.cupHas-1);
		
	}
}
