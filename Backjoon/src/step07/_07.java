package step07;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/27
 * 이름 : 이석중
 * 내용 : 백준 7단계 7번문제. 설탕 배달
 * 
 */
public class _07 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();

		if (N == 4 || N == 7) {
			System.out.println(-1);
		} else if (N % 5 == 0) {
			System.out.println(N / 5);
		} else if (N % 5 == 1 || N % 5 == 3) {
			System.out.println((N / 5) + 1);
		} else if (N % 5 == 2 || N % 5 == 4) {
			System.out.println((N / 5) + 2);
		}

		in.close();

	}

}
