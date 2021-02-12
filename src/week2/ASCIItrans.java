package week2;

import java.util.Scanner;
public class ASCIItrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
		System.out.println("Please enter a letter");
		char ch=in.next().charAt(0);
		int asciiCode=ch;
		int asciiValue=(int)ch;
		
		System.out.println("ASCII value of"+ch+ "is: " +asciiCode);
		System.out.println("ASCII value of"+ch+ "is: " +asciiValue);
		
	}

}
