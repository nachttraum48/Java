package ch05;

/*
 * 날짜 : 2022/08/26
 * 이름 : 이석중
 * 내용 : private 변수에 접근하기
 * 
 */
public class P165 {
	
	public static void main(String[] args) {
		P164 studentLee = new P164();
		// studentLee.studentName = "이상원"; -> private로 접근 불가
		studentLee.setStudentName("이상원");
		
		System.out.println(studentLee.getStudentName());
	}
	
}
