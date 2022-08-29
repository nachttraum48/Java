package Ch05;

/*
 * 날짜 : 2022/08/29
 * 이름 : 이석중
 * 내용 : 예제 5-5. 정적 메소드 사용하기
 * 
 */
public class _05 {
	
	public static int cube(int x) {
		int result = x*x*x;
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println("10*10*10은 " + cube(10));
		
	}

}
