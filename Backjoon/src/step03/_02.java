package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/24
 * 이름 : 이석중
 * 내용 : 백준 3단계 2번문제. A+B - 3
 * 
 */
public class _02 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		 
		int c = in.nextInt();
		int arr[] = new int[c];
 
		for (int i = 0; i < c; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			arr[i] = a + b;
		}
		
		in.close();
 
		for (int k : arr) {
			System.out.println(k);
		}
		
	}

}
