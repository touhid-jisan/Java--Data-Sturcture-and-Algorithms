package project.coffeemachine2;

public class Action {
	public static int waterHas = 400;
	public static int milkHas = 540;
	public static int beansHas = 120;
	public static int cupHas = 9;
	public static int moneyHas = 	550;
	
	public Action() {
		this.waterHas = waterHas;
		this.milkHas = milkHas;
		this.beansHas = beansHas;
		this.cupHas = cupHas;
		this.moneyHas = moneyHas;

	}
	
	public void setWater(int waterHas) {
		this.waterHas = waterHas ;
	}
	public void setMilk(int milkHas) {
		this.milkHas = milkHas;
	}
	public void setCoffeeBeans(int beansHas) {
		this.beansHas = beansHas;
	}
	public void setCup(int cupHas) {
		this.cupHas = cupHas;
	}
	public void setMoney(int moneyHas) {
		this.moneyHas = moneyHas;
	}
	public int getWater() {
		return waterHas;
	}
	public int getMilk() {
		return milkHas;
	}
	public int getBeans() {
		return beansHas;
	}
	public int getCup () {
		return cupHas;
	}
	public int getMoney() {
		return moneyHas;
	}
	@Override
	public String toString() {
		return "The coffee machine has: \n" + getWater() + " of water\n" +
				getMilk() + " of milk\n" + 
				getBeans() + " of coffee beans\n" + 
				getCup() + " of disposable cups\n" + 
				getMoney() + " of money";
	}
	
	//public void addElements() {}
	
}
