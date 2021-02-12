package week2;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ac=new Scanner(System.in);
		System.out.println("Enter the base-width of a triangle.");
		double base= ac.nextDouble();
		Scanner ab = new Scanner (System.in);
		System.out.print("enter the height of a triangle");
		double height=ab.nextDouble();
		
		if (base>=0 && height>=0) {
			double area=base*height/2;
			System.out.print("The area of the triangle is " +area);
		}
		else {
			System.out.print("please enter a valid number");
			}
	}

}
