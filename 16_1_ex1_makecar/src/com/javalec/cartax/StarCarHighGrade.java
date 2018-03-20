package com.javalec.cartax;

public class StarCarHighGrade extends StarCar{
	private int tax = 1000; 
	
	public StarCarHighGrade(String color, String tire, int displacement, String handle) {
		// TODO Auto-generated constructor stub
		super(color, tire, displacement, handle);
	}
	
	@Override
	public void getSpec() {
		// TODO Auto-generated method stub
		System.out.println("******자동차2의 세금측정");
		
		System.out.println("자동차 색상: "+ Color);
		System.out.println("자동차 타이어: "+ Tire);
		System.out.println("자동차 배기량: "+ Displacement);
		System.out.println("자동차 핸들: "+ Handle);
		
		if(Displacement > 2000) tax = 1500; 
		System.out.println("세금 : " + tax);
		
	}
}
