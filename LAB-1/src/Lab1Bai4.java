import java.util.Scanner;

public class Lab1Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap he so a:");
		float a = scanner.nextFloat();
		System.out.print("nhap he so b:");
		float b = scanner.nextFloat();
		System.out.print("nhap he so c:");
		float c = scanner.nextFloat();
		double delta = Math.pow(b, 2)- 4 * a * c;
		if(delta >= 0)
		{
			double dta = Math.sqrt(delta);
			System.out.printf("delta bang:%.2f", dta);
		}else
		{
			System.out.printf("delta ko co nghiem");
		}
	}

}
