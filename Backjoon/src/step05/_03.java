package step05;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/25
 * 이름 : 이석중
 * 내용 : 백준 5단계 3번문제. 한수
 * 
 */
public class _03 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print(arithmetic_sequence(in.nextInt()));
		in.close();
		
	}
 
	public static int arithmetic_sequence(int num) {
		int cnt = 0; // 한수 카운팅
 
		if (num < 100) {
			return num;
		}
 
		else {
			cnt = 99;
 
			for (int i = 100; i <= num; i++) {
				int hun = i / 100; // 백의 자릿수
				int ten = (i / 10) % 10; // 십의 자릿수
				int one = i % 10;
 
				if ((hun - ten) == (ten - one)) { // 각 자릿수가 수열을 이루면
					cnt++;
				}
			}
		}
 
		return cnt;
		
	}

}
