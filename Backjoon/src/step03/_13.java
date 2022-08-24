package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/24
 * 이름 : 이석중
 * 내용 : 백준 3단계 13번문제. 더하기 사이클
 * 
 */
public class _13 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();
		in.close();
        
		int cnt = 0;
		int copy = N;
        
		while (true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
			if (copy == N) {
				break;
			}
		}
		System.out.println(cnt);
		
	}

}
