package week2;

import java.util.Scanner;

public class Investinterests {
	public static void main(String[] args) {
		System.out.println("Welcome to Compound interest Caculate");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please neter your investment amount");
		double amount=sc.nextDouble();
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Please enter your monthly interests");
		double interest=sc2.nextDouble();
		
		Scanner sc3=new Scanner(System.in);
		System.out.println("Please enter number of years");
		int year=sc3.nextInt();
		
		double compoundinterest=amount*Math.pow((1+interest),(year*12));
		System.out.println("Your Compound interest is " + compoundinterest);
		
	}
}
