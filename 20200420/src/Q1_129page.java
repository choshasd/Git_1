/*
 * �ڿ��� 1���� �����ؼ� ��� Ȧ���� ���� ������. �׸��� �� ����
 * ���� 1000�� �Ѿ����, �׸��� 1000�� �Ѿ ���� �󸶰� �Ǵ��� 
 * ����Ͽ� ����ϴ� ���α׷��� �ۼ��غ���
 * */
public class Q1_129page {
	
	public static void main(String[] args) {
		int a = 1;
		int total = 0;
		
		while(true) {
			total += a;
			a += 2;
			if(total>1000)
				break;
		}
		System.out.println("�Ѵ����� = "+total);
		System.out.println("������ Ȧ�� = "+a);
	}

}
