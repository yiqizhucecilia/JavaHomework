package week2;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in =new Scanner(System.in);
			System.out.print("enter the radius of the circle ");
			double radius=in.nextDouble();
			
			if (radius>0) {
				double area=radius*radius*3.14;
				double circ=radius*2*3.14;
				System.out.println("The area of the circle is " +area);
				System.out.println("The raduis of the circle is " + circ);
			}
			else {
				System.out.print("please enter a valid number");
	        }

      }
}
