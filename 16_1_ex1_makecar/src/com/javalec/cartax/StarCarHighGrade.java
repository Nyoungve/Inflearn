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
		System.out.println("******�ڵ���2�� ��������");
		
		System.out.println("�ڵ��� ����: "+ Color);
		System.out.println("�ڵ��� Ÿ�̾�: "+ Tire);
		System.out.println("�ڵ��� ��ⷮ: "+ Displacement);
		System.out.println("�ڵ��� �ڵ�: "+ Handle);
		
		if(Displacement > 2000) tax = 1500; 
		System.out.println("���� : " + tax);
		
	}
}
