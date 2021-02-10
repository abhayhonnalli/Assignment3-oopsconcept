package com.shape;

public class Rectangle implements Polygon{
	float length;
	float breadth;
	

	
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	public void calcArea() {
		// TODO Auto-generated method stub
		float area=length*breadth;
		System.out.println("Area of rectangle ="+area);
		
	}


	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		float peri=2*(length*breadth);
		System.out.println("Area of rectangle ="+peri);
	}
}
