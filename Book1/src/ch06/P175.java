package ch06;

/*
 * 날짜 : 2022/09/02
 * 이름 : 이석중
 * 내용 : 학생 클래스 구현하기
 * 
 */
public class P175 {
	
	public String studentName;
	public int grade;
	public int money;
	
	public P175(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(P177_1 bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(P177_2 subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
	
}
