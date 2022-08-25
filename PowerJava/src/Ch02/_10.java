package Ch02;

/*
 * 날짜 : 2022/08/26
 * 이름 : 이석중
 * 내용 : 예제 2-10. 비트 이동 연산자 실습하기
 * 
 */
public class _10 {

	public static void main(String[] args) {
		
		int x = 0b00001101;
		int y = 0b00001010;
		
		System.out.print("x&y = " + (x&y) + "    ");
		System.out.print("x|y = " + (x|y) + "    ");
		System.out.print("x^y = " + (x^y) + "    ");
		System.out.println("~x = " + (~x) + "    ");
		System.out.print("x>>1 = " + (x>>1) + "   ");
		System.out.print("x<<1 = " + (x<<1) + "   ");
		System.out.println("x>>>1 = " + (x>>>1));
		
	}

}
