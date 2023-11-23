//Write a Java program to create a simple calculator
package If_Else_If;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the 1st number :");
		int num1 = 5;//
		//System.out.println("Enter the 2nd number :");
		int num2 = 10;//sc.nextFloat();
		System.out.println(num1+num2);
		System.out.println(num1*num2);
		System.out.println(num1-num2);
		//System.out.println(num1/num2);
		
		System.out.println("num1+num2");
		System.out.println("num1*num2");
		System.out.println("num1-num2");
		
		
		System.out.println("5+10 "+num1);
		System.out.println("5+10 "+num1+ " " +num2);*/
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number :");
		float num1 = sc.nextFloat();
		System.out.println("Enter the 2nd number :");
		float num2 = sc.nextFloat();
		System.out.println("select the operators : +,-,*,/");
		char op=sc.next().charAt(0);
		
		if(op == '+') {
			System.out.println(num1+num2);
		}
		else if(op == '-') {
			System.out.println(num1-num2);
		}
		else if(op == '*') {
			System.out.println(num1*num2);
		}
		else if(op == '/') {
			System.out.println(num1/num2);
		}
		else {
			System.out.println("invalid operator");
		}
		}
		
	}

}
