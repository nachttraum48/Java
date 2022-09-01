package Ch06;

/*
 * 날짜 : 2022/09/01
 * 이름 : 이석중
 * 내용 : 예제 6-6. has-a 관계 예제
 * 
 */
class Date {
	
	private int year, month, date;

	public Date(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Date [year=" + year + " month=" + month + " date=" + date + "]";
	}
	
}

class Employee_3 {
	
	private String name;
	private Date birthDate;
	
	public Employee_3(String name, Date birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", birthDate=" + birthDate + "]";
	}
	
}

public class _06 {

	public static void main(String[] args) {
		
		Date birth = new Date(1990, 1, 1);
		Employee_3 employee = new Employee_3("홍길동", birth);
		System.out.println(employee);
		
	}

}
