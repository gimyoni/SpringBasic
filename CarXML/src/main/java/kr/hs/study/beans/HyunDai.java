package kr.hs.study.beans;

public class HyunDai extends Car{
	private String name;
	private String color;
	private Car c1;
	
	public HyunDai() {
		
	}
	
	public HyunDai(Car c1) {
		this.c1 = c1;
	}
	
	public HyunDai(Car c1, String name, String color) {
		super();
		this.c1 = c1;
		this.name = name;
		this.color = color;
	}

	@Override
	public void order() {
		System.out.println("가격 : " + c1.getMoney());
		System.out.println(name + " 주문하다");
		System.out.println("이름 : " + this.name);
		System.out.println("색상 : " + this.color);
	}
}
