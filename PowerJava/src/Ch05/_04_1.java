package Ch05;

/*
 * 날짜 : 2022/08/29
 * 이름 : 이석중
 * 내용 : 예제 5-4. 정적 메소드 사용하기
 * 
 */
public class _04_1 {
	
	public static int abs(int x) {
		return x > 0 ? x : -x;
	}
	
	public static int power(int base, int exponent) {
		
		int result = 1;
		
		for (int i = 1; i <= exponent; i++) {
			result *= base;
		}
		return result;		
	}

}
