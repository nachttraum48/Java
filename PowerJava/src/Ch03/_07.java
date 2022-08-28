package Ch03;

/*
 * 날짜 : 2022/08/28
 * 이름 : 이석중
 * 내용 : 예제 3-7. 정수의 합 계산하기
 * 
 */
public class _07 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 0; i < 10; i++) {
			sum += i;
		}
		
		System.out.println("1부터 10까지의 정수의 합 = " + sum);
		
	}

}
