package week2;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner ad = new Scanner(System.in);
		System.out.print("enter a number:");		
		int numbereo = ad.nextInt();

		if (numbereo%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");	
		}
			
		
	}

}
