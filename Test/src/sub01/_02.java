package sub01;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/07
 * 이름 : 이석중
 * 내용 : 수행평가 문제 2번
 * 
 */
public class _02 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("< 입력 >");
		int N = in.nextInt();
		in.close();
 
		System.out.println();
		System.out.println("< 출력 >");
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
