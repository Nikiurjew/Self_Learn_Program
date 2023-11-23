//Write a program to check whether a number is divisible by 5 and 11 or not
package If_Else_If;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		
		if(num%5==0) {
			System.out.println("The number is divisible by 5");
		}
		else if(num %11==0) {
			System.out.println("The number is divisible by 11");
		}
		else {
			System.out.println("The number is not divisible by 5 and 11");
		}
		}

	}

}
