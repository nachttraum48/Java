package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/24
 * 이름 : 이석중
 * 내용 : 백준 3단계 3번문제. 합
 * 
 */
public class _03 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		 
		int a = in.nextInt();
		in.close();
		
		int sum = 0;
        
		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}

}
