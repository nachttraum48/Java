package Ch06;

/*
 * 날짜 : 2022/09/01
 * 이름 : 이석중
 * 내용 : 예제 6-3. Person 클래스와 Student 클래스 만들어보기
 * 
 */
class Person_1 {
	
	// private String regnumer;
	private double weight;
	protected int age;
	String name;
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}

class Student extends Person_1 {
	int id;
}

public class _03 {

	public static void main(String[] args) {
		
		Student obj = new Student();
		// obj.regnumber = "123456-123456";
		// obj.weight = 75.0;
		obj.age = 21;
		obj.name = "Kim";
		obj.setWeight(75.0);
		
	}

}
