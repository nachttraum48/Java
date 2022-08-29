package Ch05;

import java.util.ArrayList;

/*
 * 날짜 : 2022/08/29
 * 이름 : 이석중
 * 내용 : 예제 5-6. 객체 배열 만들기
 * 
 */
class Person {
	
	String name;
	String tel;
	
	public Person(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
}

public class _07 {
	
	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("홍길동", "01012345678"));
		list.add(new Person("김유신", "01012345679"));
		list.add(new Person("최자영", "01012345680"));
		list.add(new Person("김영희", "01012345681"));
		
		for (Person obj : list) {
			System.out.println("(" + obj.name + ", " + obj.tel + ")");
		}
		
	}

}
