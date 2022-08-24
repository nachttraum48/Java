package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/24
 * 이름 : 이석중
 * 내용 : 백준 3단계 11번문제. A+B - 5
 * 
 */
public class _11 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		while(true){
		
			int A = in.nextInt();
			int B = in.nextInt();
		
			if(A == 0 && B == 0){
				in.close();
				break;
			}
			System.out.println(A + B);
		}
		
	}

}
