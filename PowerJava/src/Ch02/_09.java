package Ch02;

/*
 * 날짜 : 2022/08/26
 * 이름 : 이석중
 * 내용 : 예제 2-9. 비트 연산자 실습하기
 * 
 */
public class _09 {

	public static void main(String[] args) {
		
		byte status = 0b01101110;
		System.out.println("문열림 상태 = " + ((status & 0b00000100) != 0));
		
	}

}
