import java.util.Scanner;

/*
 * �������� ¦�� ���� 2, 4, 6, 8�ܸ� ����ϴ� ���α׷��� �ۼ��ϵ� 2����
 * 2x2, 4���� 4X4...�� ����ϵ��� �ۼ�����
 * */
public class Q1_135p {
	
	public static void main(String[] args) {
	System.out.println("�Է��� �ܼ��� �ִ밪�� �Է��ϼ���");
	Scanner scan_dan = new Scanner(System.in);
	
	int dan = scan_dan.nextInt();
	scan_dan.close();
	
	System.out.println("dan = "+dan);
	
		for(int i = 1;i<dan+1;i++) {
			for(int j = 1;j<i+1;j++) {
				if(i%2 == 0) {
					System.out.println(i+"X"+j+"="+i*j);
				}
				else {
					continue;
				}
			}
		}
	
	}
}
