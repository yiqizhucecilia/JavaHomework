package week2;

import java.util.Scanner;

public class Roundnumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a number");
		
		double dou=sc.nextDouble();
		
		int roundint1; // Declear the variable here , then I only have to write one system out print sentence. 
		
		if (dou-(int)dou>=0.5) {
			 roundint1= (int)(dou)+1;
		}else { roundint1=(int)(dou);

		}
		System.out.println("The round number of " + dou + " is " + roundint1);
	}
}
	
