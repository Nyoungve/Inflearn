package com.javalec.cartax;

public abstract class StarCar {
	
	public String Color; 
	public String Tire; 
	public int Displacement; 
	public String Handle; 
	
	public StarCar(String color, String tire, int displacement, String handle) {
		// TODO Auto-generated constructor stub
		this.Color = color; 
		this.Tire = tire; 
		this.Displacement = displacement; 
		this.Handle = handle;
	}
	
	//�ڵ��� ��ⷮ �߻� �޼ҵ� 
	public abstract void getSpec();
	
}
