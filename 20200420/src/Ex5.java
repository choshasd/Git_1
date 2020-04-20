import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		System.out.println("번호를 입력하세요");
		Scanner scan = new Scanner(System.in);
		scan.close();
		
		int input = scan.nextInt();
		
		
		// ctrl + shift + f : 자동정렬
		switch (input) {
		
		case 1:
			System.out.println("가위");
			break;
			
		case 2:
			System.out.println("바위");
			break;
			
		case 3:
			System.out.println("보");
			break;

		default:
			System.out.println("1,2,3 중에 입력하여주세요");
			break;
		}
	}
}
