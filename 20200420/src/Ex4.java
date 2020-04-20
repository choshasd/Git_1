
public class Ex4 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		String c = "";
		
		c  = a>b? "a가 큽니다":"b가 큽니다";
		
		System.out.println("c = "+ c);
		System.out.println("c = "+ (a>b? "a가 큽니다":"b가 큽니다")); // 이런식으로 바로 해도 된다
		
		int d = a>b? 3:2; // 뒤에 문자열을 담는게 아니라 int 형을 담기 때문에 이렇게할수있음
								// a와 b를 비교하여 true면 앞번호 false면 뒷번호가 나옴
		
		System.out.println("d = "+d);
	}
}
