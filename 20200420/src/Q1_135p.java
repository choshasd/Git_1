import java.util.Scanner;

/*
 * 구구단의 짝수 단인 2, 4, 6, 8단만 출력하는 프로그램을 작성하되 2단은
 * 2x2, 4단은 4X4...만 출력하도록 작성하자
 * */
public class Q1_135p {
	
	public static void main(String[] args) {
	System.out.println("입력할 단수의 최대값을 입력하세요");
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
