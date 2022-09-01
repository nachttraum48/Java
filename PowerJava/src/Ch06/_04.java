package Ch06;

/*
 * 날짜 : 2022/09/01
 * 이름 : 이석중
 * 내용 : 예제 6-4. Person 클래스와 Student 클래스 만들어보기
 * 
 */
class Person_2 {
	
	String name;
	
	public Person_2() {}
	public Person_2(String theName) {
		this.name = theName;
	}
	
}

class Employee_1 extends Person_2 {
	
	String id;
	
	public Employee_1() {
		super();
	}
	
	public Employee_1(String name) {
		super(name);
	}
	
	public Employee_1(String name, String id) {
		super(name);
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + " name=" + name + "]";
	}
	
}

public class _04 {

	public static void main(String[] args) {
		
		Employee_1 e = new Employee_1("Kim", "20210001");
		System.out.println(e);
		
	}

}
