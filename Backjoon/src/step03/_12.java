package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/24
 * 이름 : 이석중
 * 내용 : 백준 3단계 12번문제. A+B - 4
 * 
 */
public class _12 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		while(in.hasNextInt()){
		
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(a + b);
		
		}	
		in.close();
		
	}

}
