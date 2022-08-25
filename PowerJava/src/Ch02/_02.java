package Ch02;

/*
 * 날짜 : 2022/08/26
 * 이름 : 이석중
 * 내용 : 예제 2-2. 원의 면적 계산하기
 * 
 */
public class _02 {

	public static void main(String[] args) {
		
		final double PI = 3.141592;
		double radius, area;
		
		radius = 5.0;
		area = PI * radius * radius;
		System.out.println("반지름이 5인 원의 면적은 " + area);
		
	}

}
