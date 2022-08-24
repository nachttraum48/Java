package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/24
 * 이름 : 이석중
 * 내용 : 백준 2단계 4번문제. 사분면 고르기
 * 
 */
public class _04 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        
		int X = in.nextInt();
		int Y = in.nextInt();
		in.close();
		
		if(X > 0) {
			if(Y > 0) {
				System.out.print(1);
			} 
			else {
				System.out.print(4);
			}
		} 
		
		else {
			if(Y > 0) {
				System.out.print(2);
			} 
			else {
				System.out.print(3);
			}
		}
		
	}

}
