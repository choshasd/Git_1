import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� a�� �Է��ϼ���");
		int a = Integer.parseInt(scan.nextLine());// String�� Int�� ����ȯ
		
		System.out.println("���� b�� �Է��ϼ���");
		int b = scan.nextInt();
		
		scan.close();
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		if(a > b ) {
			System.out.println("a�� ũ��");
		}
		else if(a < b ) {
			System.out.println("b�� ũ��");
		}else{
			System.out.println("a�� b�� ����");
		}
	}
}
