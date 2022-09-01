package Ch06;

/*
 * 날짜 : 2022/09/01
 * 이름 : 이석중
 * 내용 : 예제 6-5. Employee 클래스
 * 
 */
class Employee_2 {
	
	public int baseSalary = 3000000;
	
	int getSalary() {
		return baseSalary;
	}
	
}

class Manager extends Employee_2 {
	
	@Override
	int getSalary() {
		return baseSalary + 2000000;
	}
	
}

class Programmer extends Employee_2 {
	
	@Override
	int getSalary() {
		return baseSalary + 3000000;
	}
	
}

public class _05 {

	public static void main(String[] args) {
		
		Manager obj1 = new Manager();
		System.out.println("관리자의 월급 : " + obj1.getSalary());
		
		Programmer obj2 = new Programmer();
		System.out.println("프로그래머의 월급 : " + obj2.getSalary());
		
	}

}
