package project.coffeemachine2;

public class Take extends Action{
	public void takeMoney() {
		
		System.out.println("I gave you $"+getMoney());
		setMoney(0);
	}
}
