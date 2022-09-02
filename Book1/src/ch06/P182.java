package ch06;

/*
 * 날짜 : 2022/09/02
 * 이름 : 이석중
 * 내용 : static 변수 사용하기
 * 
 */
public class P182 {
	
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
}
