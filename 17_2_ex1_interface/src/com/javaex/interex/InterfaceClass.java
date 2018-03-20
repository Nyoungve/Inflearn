package com.javaex.interex;

public class InterfaceClass implements InterfaceEx, InterfaceEx2{

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("실제구문은 여기에서 해요.");
	}
	
	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		System.out.println("실제구문은 여기예요.");
		return null;
	}
}
