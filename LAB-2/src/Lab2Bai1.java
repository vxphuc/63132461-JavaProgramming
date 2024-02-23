import java.util.Scanner;
public class Lab2Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap he so a:");
		float a = scanner.nextFloat();
		System.out.print("nhap he so b:");
		float b = scanner.nextFloat();
		if(a == 0)
		{
			if(b == 0)
			{
				System.out.print("phuong trinh vo nghiem:");
				
			}else
			{
				System.out.print("phuong trinh vo so nghiem");
			}
		}else
		{
			double x = -b / a;
			System.out.printf("nghiem cua PT: %.2f", x);
		}
		
	}

}
