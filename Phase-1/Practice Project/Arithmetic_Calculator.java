package Practice_Project;
import java.util.Scanner;

public class Arithmetic_Calculator {

	public static void main(String[] args) {
		System.out.println("Arithmatic calculator");
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter two numbers ");
			int firstnumber = input.nextInt();
			int secondnumber = input.nextInt();
			System.out.println(" 1.Addition \n 2.subtraction \n 3.multiplication \n 4.division");
			int num = input.nextInt();
			switch (num) {
			case 1: System.out.println("Addition of two Numbers :"+(firstnumber+secondnumber));
					break;
			case 2: System.out.println("subtraction of two numbres :"+(firstnumber-secondnumber));
					break;
			case 3: System.out.println("multiplication of two numbers :"+(firstnumber*secondnumber));
					break;
			case 4: System.out.println("division of two numbers :"+(firstnumber/secondnumber));
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + num);
			}
		}	
	}
}
