/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab1Bai2 {

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
		double dientich = Cdai * Crong;
        double canhnho = Math.min(Cdai, Crong);
        
		System.out.printf("chu vi hinh chu nhat la:%.2f", chuvi);
		System.out.printf("\ndien tich hinh chu nhat la:%.2f", dientich);
		System.out.printf("\ncanh nho nhat la:%.2f", canhnho);
		
	}

}
