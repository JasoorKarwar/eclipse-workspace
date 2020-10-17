import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter three distinct numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		if (num1 >= num2) {
			if (num1 > num3) {
				System.out.println("The largest number is " + num1);
			}
		} else if (num2 > num1) {
			if (num2 > num3) {
				System.out.println("The largest number is " + num2);
			} else {
				System.out.println("The largest number is " + num3);
			}
		}
	}
}
