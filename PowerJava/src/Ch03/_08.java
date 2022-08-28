package Ch03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/28
 * 이름 : 이석중
 * 내용 : 예제 3-8. 팩토리얼 계산하기
 * 
 */
public class _08 {

	public static void main(String[] args) {
		
		long fact = 1;
		int n;
		
		System.out.print("정수를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		
		System.out.printf("%d!은 %d입니다.\n", n, fact);
		
		scan.close();
		
	}

}
