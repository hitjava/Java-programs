package CURIE;
import java.util.Scanner;
public class area_of_square {

	
	public static void main(String[] args) {
		System.out.println("Enter Side of  the Square:");
		Scanner scanner = new Scanner(System.in);
		double side = scanner.nextDouble();
		double area = side*side;
		System.out.println("Area of Square is: "+area);

	}

}
