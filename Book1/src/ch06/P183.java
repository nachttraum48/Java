package ch06;

/*
 * 날짜 : 2022/09/02
 * 이름 : 이석중
 * 내용 : static 변수 테스트하기
 * 
 */
public class P183 {
	
	public static void main(String[] args) {
		
		P182 studentLee = new P182();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		P182 studentSon = new P182();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
		
	}
	
}
