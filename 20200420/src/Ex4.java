
public class Ex4 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		String c = "";
		
		c  = a>b? "a�� Ů�ϴ�":"b�� Ů�ϴ�";
		
		System.out.println("c = "+ c);
		System.out.println("c = "+ (a>b? "a�� Ů�ϴ�":"b�� Ů�ϴ�")); // �̷������� �ٷ� �ص� �ȴ�
		
		int d = a>b? 3:2; // �ڿ� ���ڿ��� ��°� �ƴ϶� int ���� ��� ������ �̷����Ҽ�����
								// a�� b�� ���Ͽ� true�� �չ�ȣ false�� �޹�ȣ�� ����
		
		System.out.println("d = "+d);
	}
}
