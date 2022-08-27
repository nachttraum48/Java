package step07;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/27
 * 이름 : 이석중
 * 내용 : 백준 7단계 1번문제. 손익분기점
 * 
 */
public class _01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();	// 불변 비용
		int B = in.nextInt();	// 가변 비용
		int C = in.nextInt(); 	// 상품 가격
        
		if (C <= B) {
			System.out.println("-1");
		} 
		else {
			System.out.println((A/(C-B))+1);
		}
		
		in.close();
		
	}

}
