package ch06;

/*
 * 날짜 : 2022/09/02
 * 이름 : 이석중
 * 내용 : this로 다른 생성자 호출하기
 * 
 */
class Person_1 {
	
	String name;
	int age;
	
	Person_1() {
		this("이름 없음", 1);
	}
	
	Person_1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}

public class P172 {

	public static void main(String[] args) {
		
		Person_1 noName = new Person_1();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
	}

}
