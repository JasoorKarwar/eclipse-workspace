import java.util.Scanner;

public class ScannerPrac002 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your age" + " ");
		int age = input.nextInt();
		
		System.out.println("Your age after 10 years is "+ (age+10));

	}

}
