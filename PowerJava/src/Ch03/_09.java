package Ch03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/28
 * 이름 : 이석중
 * 내용 : 예제 3-9. 약수 계산하기
 * 
 */
public class _09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수를 입력하시오 : ");
		int n = scan.nextInt();
		
		System.out.println(n + "의 약수는 다음과 같습니다.");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(" " + i);
			}
		}
		
		scan.close();
		
	}

}
