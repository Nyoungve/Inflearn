package com.javalec.cartax;

public class MainClass {
	public MainClass() {
		// TODO Auto-generated constructor stub
	}
    public static void main(String[] args) {
		StarCarLowGrade starCarLowGrade = new StarCarLowGrade(CarSpecs.COLOR_BLUE, CarSpecs.TIRE_NORMAL, CarSpecs.DISPLACEMENT_2000, CarSpecs.HANDLE_POWER);
		StarCarHighGrade starCarHighGrade = new StarCarHighGrade(CarSpecs.COLOR_RED, CarSpecs.TIRE_MILD, CarSpecs.DISPLACEMENT_2200, CarSpecs.HANDLE_POWER);
		
		
		starCarLowGrade.getSpec();
		System.out.println("");
		starCarHighGrade.getSpec();
    
    }
}
