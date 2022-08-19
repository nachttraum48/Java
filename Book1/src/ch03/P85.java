package ch03;

/*
 * 날짜 : 2022/08/18
 * 이름 : 이석중
 * 내용 : 비트 이동 연산자를 사용하여 연산하기
 * 
 */
public class P85 {

	public static void main(String[] args) {
		
		int num = 0B00000101;
		
		System.out.println(num << 2);
		System.out.println(num >> 2);
		System.out.println(num >>> 2);
		
		System.out.println(num);
		
		num = num << 2;
		System.out.println(num);

	}

}
