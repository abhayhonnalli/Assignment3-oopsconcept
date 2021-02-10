package com.shape;


public class Square implements Polygon {
	float side;
	
	

	public Square(float side) {
		super();
		this.side = side;
	}

	
	public void calcArea() {
		// TODO Auto-generated method stub
		Float area= side*side;
		System.out.println("Area of the square = "+area);
		
	}

	
	public void calcPeri() {
		// TODO Auto-generated method stub
		Float peri=4*side;
		System.out.println("Perimeter of the square ="+peri);
		
	}

}

