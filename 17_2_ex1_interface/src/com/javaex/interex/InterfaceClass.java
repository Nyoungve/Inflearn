package com.javaex.interex;

public class InterfaceClass implements InterfaceEx, InterfaceEx2{

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("���������� ���⿡�� �ؿ�.");
	}
	
	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		System.out.println("���������� ���⿹��.");
		return null;
	}
}
