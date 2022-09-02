package ch06;

/*
 * 날짜 : 2022/09/02
 * 이름 : 이석중
 * 내용 : this를 사용하여 주소 값 반환하기
 * 
 */
class Person_2 {
	
	String name;
	int age;
	
	Person_2() {
		this("이름 없음", 1);
	}
	
	Person_2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person_2 returnSelf() {
		return this;
	}
	
}

public class P173 {

	public static void main(String[] args) {
		
		Person_2 noName = new Person_2();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person_2 p = noName.returnSelf();
		System.out.println(p);
		System.out.println(noName);
		
	}

}
