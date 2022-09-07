package sub01;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/07
 * 이름 : 이석중
 * 내용 : 수행평가 문제 1번
 * 
 */
public class _01 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("< 입력 >");
		int N = in.nextInt();
		in.close();
 
		System.out.println();
		System.out.println("< 출력 >");
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
