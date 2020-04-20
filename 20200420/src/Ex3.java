import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 a를 입력하세요");
		int a = Integer.parseInt(scan.nextLine());// String을 Int로 형변환
		
		System.out.println("정수 b를 입력하세요");
		int b = scan.nextInt();
		
		scan.close();
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		if(a > b ) {
			System.out.println("a가 크다");
		}
		else if(a < b ) {
			System.out.println("b가 크다");
		}else{
			System.out.println("a와 b가 같다");
		}
	}
}
