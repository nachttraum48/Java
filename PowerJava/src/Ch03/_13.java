package Ch03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/28
 * 이름 : 이석중
 * 내용 : 예제 3-13. 점수 평균 구하기
 * 
 */
public class _13 {

	public static void main(String[] args) {
		
		int total = 0, count = 0;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("점수를 입력하시오 : ");
			int grade = sc.nextInt();
			if (grade < 0) {
				break;
			}
			total += grade;
			count++;
		}
		
		System.out.println("평균은 " + (total / count));
		
		sc.close();
		
	}

}
