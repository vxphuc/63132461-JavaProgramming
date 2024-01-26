/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab2Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("chieu dai:");
		float Cdai = scanner.nextFloat();
		System.out.print("chieu rong:");
		float Crong = scanner.nextFloat();
		double chuvi = (Cdai + Crong)* 2;
		
		System.out.printf("%.2f", chuvi);
	}

}
