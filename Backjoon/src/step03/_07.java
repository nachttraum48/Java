package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/24
 * 이름 : 이석중
 * 내용 : 백준 3단계 7번문제. A+B - 8
 * 
 */
public class _07 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		 
		int T = in.nextInt();
 
		for (int i = 1; i <= T; i++) {
			int A = in.nextInt();
			int B = in.nextInt();
 
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
		}
 
		in.close();
		
	}

}
