package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/24
 * 이름 : 이석중
 * 내용 : 백준 3단계 1번문제. 구구단
 * 
 */
public class _01 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);	
		int a = in.nextInt();
		in.close();		
		
		for(int i = 1; i < 10; i++) {
			System.out.println(a + " * " + i + " = " + (a * i));
		}
		
	}

}
