import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		System.out.println("��ȣ�� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		scan.close();
		
		int input = scan.nextInt();
		
		
		// ctrl + shift + f : �ڵ�����
		switch (input) {
		
		case 1:
			System.out.println("����");
			break;
			
		case 2:
			System.out.println("����");
			break;
			
		case 3:
			System.out.println("��");
			break;

		default:
			System.out.println("1,2,3 �߿� �Է��Ͽ��ּ���");
			break;
		}
	}
}
