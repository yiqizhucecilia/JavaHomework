package week2;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		System.out.println("Welcome to BMI caculate");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter your weight in pounds");
		double weight=sc.nextDouble();
		
		Scanner sc2= new Scanner(System.in);
		System.out.println("Please enter your height in inches");
        double height=sc2.nextDouble();
        
        double BMI= (weight/(height*height))*703;
        System.out.println("Your BMI is " +BMI);
		
	}
}
