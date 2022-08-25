package step05;

/*
 * 날짜 : 2022/08/25
 * 이름 : 이석중
 * 내용 : 백준 5단계 2번문제. 셀프 넘버
 * 
 */
public class _02 {

	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001];	// 1부터 10000이므로
		 
		for (int i = 1; i < 10001; i++){
			int n = d(i);
		
			if(n < 10001){	// 10000 이 넘는 수는 필요가 없음
				check[n] = true;
			}
		}
 
		StringBuilder sb = new StringBuilder();
        
		for (int i = 1; i < 10001; i++) {
			if (!check[i]) {	// false 인 인덱스만 출력
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
		
	}
 
 
 
	public static int d(int number){
		int sum = number;
    
		while(number != 0){
			sum = sum + (number % 10); // 첫 째 자리수
			number = number/10;	// 10을 나누어 첫 째 자리를 없앤다
		}
    
		return sum;
	}
		
}
