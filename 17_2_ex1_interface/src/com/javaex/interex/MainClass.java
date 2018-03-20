package com.javaex.interex;

public class MainClass {
	public static void main(String[] args) {
		
		InterfaceClass interfaceClass = new InterfaceClass(); 
		interfaceClass.calculate();
		
		InterfaceEx interfaceEx = new InterfaceClass(); 
		InterfaceEx2 interfaceEx2 = new InterfaceClass(); 
		
		interfaceEx.calculate();
		interfaceEx2.getStr(); 
		
	}
}
