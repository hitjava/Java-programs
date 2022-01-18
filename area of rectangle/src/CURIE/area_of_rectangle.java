package CURIE;
import java.util.Scanner;
public class area_of_rectangle {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of  the Rectangle:");
		double length = scanner.nextDouble();
		System.out.println("Enter the width of  the Rectangle:");
		double width = scanner.nextDouble();
		double area = length*width;
		System.out.println("Area of Rectangle is:"+area);

	}

}
