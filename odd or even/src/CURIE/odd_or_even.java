package CURIE;
import java.util.Scanner;
public class odd_or_even {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter an Integer number:");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		if ( num % 2 == 0 )
		System.out.println("Number is even");
		else
		System.out.println("Number is odd");

	}

}
