package step04;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 날짜 : 2022/08/25
 * 이름 : 이석중
 * 내용 : 백준 4단계 1번문제. 최소, 최대
 * 
 */
public class _01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        
		int N = in.nextInt();
		int[] arr = new int[N];
        
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[N - 1]);
		
	}

}
