import java.util.Scanner;

public class Lab1Bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("canh cua khoi lap phuong:");
		float canh = scanner.nextFloat();
		double thetich = Math.pow(canh, 3);
		System.out.printf("the tich khoi lap phuong:%.2f", thetich);

	}

}
