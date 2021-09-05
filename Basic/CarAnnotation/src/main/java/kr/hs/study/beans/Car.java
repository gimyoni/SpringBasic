package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private int money;

	public Car() {
		
	}
	
	public Car(@Value("10000000") int money) {
		super();
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
