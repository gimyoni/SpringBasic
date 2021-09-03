package kr.hs.study.beans;

public class Car {
	private int money;

	public Car() {
		
	}
	
	public Car(int money) {
		this.money = money;
	}
	
	public void order() {
		System.out.println("주문하다");
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}
