package step08;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/27
 * 이름 : 이석중
 * 내용 : 백준 8단계 3번문제. 소인수분해
 * 
 */
public class _03 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		 
		for (int i = 2; i <= Math.sqrt(N); i++) {	// 또는 i * i <= N
			while (N % i == 0) {
				System.out.println(i);
				N /= i;
			}
		}
		if (N != 1) {
			System.out.println(N);
		}
		
		in.close();
		
	}

}
