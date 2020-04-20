import java.util.Scanner;

/*
 * yum install java1.8* -y
 * 
 * javac명령어로 컴파일 하는것
 * 이클립스를 사용하기떄문에 자동 컴파일 됨
 * java ex1.class
 * 
 * debug : 이클립스에서 사용하는 개발자 개발도구
 * */

public class ex1 {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		
		/*
		 * 
		 * char a[30];
		 * fgets(a,stdin);
		 * 
		 * */
		System.out.println("입력하세요");
		Scanner scan2 = new Scanner(System.in);
		String inputValue = scan2.nextLine();
		String input2 = scan2.nextLine();
		scan2.close();
		System.out.println("inputValue = "+inputValue);
		System.out.println("inputValue = "+input2);
		
	}
}
