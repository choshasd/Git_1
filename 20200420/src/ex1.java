import java.util.Scanner;

/*
 * yum install java1.8* -y
 * 
 * javac��ɾ�� ������ �ϴ°�
 * ��Ŭ������ ����ϱ⋚���� �ڵ� ������ ��
 * java ex1.class
 * 
 * debug : ��Ŭ�������� ����ϴ� ������ ���ߵ���
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
		System.out.println("�Է��ϼ���");
		Scanner scan2 = new Scanner(System.in);
		String inputValue = scan2.nextLine();
		String input2 = scan2.nextLine();
		scan2.close();
		System.out.println("inputValue = "+inputValue);
		System.out.println("inputValue = "+input2);
		
	}
}
