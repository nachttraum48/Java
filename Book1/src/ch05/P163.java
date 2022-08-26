package ch05;

/*
 * 날짜 : 2022/08/26
 * 이름 : 이석중
 * 내용 : private 변수 테스트하기
 * 
 */
public class P163 {
	
	public static void main(String[] args) {
		P162 studentLee = new P162();
		// private 선언으로 외부 클래스의 접근 허용 X
		// studentLee.studentName = "이상원";
		
		System.out.println(studentLee.getStudentName());
	}
	
}
