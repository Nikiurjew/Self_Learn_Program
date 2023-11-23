// Write a program to find maximum between two numbers
package If_Else_If;

import java.util.Scanner;

public class Find_Max_Number {

	public static void main(String[] args) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number:");
		double num1=sc.nextDouble();
		System.out.println("Enter the 2nd number:");
		double num2 = sc.nextDouble();
		//System.out.println("Enter the 3rd number:");
		//double num3 = sc.nextDouble();
		
		if(num1 > num2) {
			System.out.println("the number is maximum"+num1);
		}
		else if(num1 < num2){
			System.out.println("the number is not maximum"+num2);
		}
		else {
			System.out.println("Both number are equal");
		}
		}
		

	}

}
