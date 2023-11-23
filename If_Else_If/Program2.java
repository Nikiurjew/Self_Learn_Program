//WAP on Eligible to vote
package If_Else_If;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		
		if(age >=18) {
			System.out.println("you are eligible");
		}
		else {
			System.out.println("you are not eligible");
		}
		}

	}

}
