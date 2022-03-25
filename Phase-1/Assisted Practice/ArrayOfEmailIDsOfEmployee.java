package Practice_Project;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ArrayOfEmailIDsOfEmployee {

	public static void main(String[] args) {
		 try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter vaild email ");  
			 String str= scan.nextLine();   
			 System.out.print(Pattern.matches("[a-z0-9]+@[a-z]+\\.[a-z]{2,3}",str));
		}

	}

}
