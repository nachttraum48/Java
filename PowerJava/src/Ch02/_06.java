package Ch02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/26
 * 이름 : 이석중
 * 내용 : 예제 2-6. 연산자 실습하기
 * 
 */
public class _06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초를 입력하시오: ");
		int time = sc.nextInt();
		int min = time / 60;
		int sec = time % 60;
		
		System.out.println(time + "초는 " + min + "분 " + sec + "초입니다.");
		
		sc.close();
		
	}

}
