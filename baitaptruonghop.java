import java.util.Scanner;

public class baitaptruonghop {
	public static void main(String[] args) {
		// Khai báo năm sinh
		int namsinh;
		
		// Nhập dữ liệu
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap nam sinh cua ban: ");
		namsinh = sc.nextInt();
		
		// In ra số tuổi
		int tuoi = 2023 - namsinh;
		System.out.println("Tuoi cua ban la "+ tuoi);
		
		switch (tuoi) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		{
			System.out.println("Ban la hoc sinh tieu hoc");
		}
			
			break;
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		{
			System.out.println("Ban la hoc sinh trung hoc");
		}
			break;
		case 16:
		case 17:
		case 18:
		{
			System.out.println("Ban la hoc sinh trung hoc pho thong");
		}
			break;

		default:
		{
			System.out.println("Ban dang la sinh vien hoac da di lam");
		}
			break;
		}
		
		
		// khoi tao mot ma tran 
		// 
	}
}