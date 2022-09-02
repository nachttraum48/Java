package ch07;

import java.util.ArrayList;

/*
 * 날짜 : 2022/09/02
 * 이름 : 이석중
 * 내용 : Student 클래스 구현하기
 * 
 */
public class P227 {
	
	int studentID;
	String studentName;
	ArrayList<P228> subjectList;
	
	public P227(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<P228>();
	}
	
	public void addSubject(String name, int score) {
		P228 subject = new P228();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for (P228 s : subjectList) {
			total += s.getScorePoint();
			System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은 " + s.getScorePoint() + "입니다.");
		}
		System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
	}
	
}
