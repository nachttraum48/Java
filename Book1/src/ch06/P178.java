package ch06;

/*
 * 날짜 : 2022/09/02
 * 이름 : 이석중
 * 내용 : 버스와 지하철 타기
 * 
 */
public class P178 {
	
	public static void main(String[] args) {
		
		P175 studentJames = new P175("James", 5000);
		P175 studentTomas = new P175("Tomas", 10000);
		
		P177_1 bus100 = new P177_1(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		P177_2 subwayGreen = new P177_2("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
		
	}
	
}
