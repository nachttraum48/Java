package step06;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/26
 * 이름 : 이석중
 * 내용 : 백준 6단계 2번문제. 숫자의 합
 * 
 */
public class _02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String inputs = sc.next();
		sc.close();
		
		int result = 0;
		for (int i = 0; i < n; ++i) {
			result += inputs.charAt(i) - '0';
		}
		
		System.out.println(result);
		
	}

}
