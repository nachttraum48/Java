package ch05;

/*
 * 날짜 : 2022/08/26
 * 이름 : 이석중
 * 내용 : Student 클래스에 main() 함수 추가하기
 * 
 */
public class P144 {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[] args) {
		P144 studentAhn = new P144();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}
