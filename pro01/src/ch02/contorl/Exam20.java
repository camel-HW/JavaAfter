package ch02.contorl;


/**
 * @Date : 2023. 1. 3. 
 * @Author : 강사
 * @Description : 제어문 - 반복문 : while 
 */

public class Exam20 {
	public static void main(String[] args) {
		int x=1;						 // 초기값
		while(x <= 10) {   		 // 조건값  
			System.out.println(x);
			x++;     					// 증가값      for(int i=1;i<=10;i++){ }
		}
		
		int sum=0;
		int cnt=1;      			   // 초기값
		while(cnt <=100) {    // 조건값
			sum += cnt;
			cnt++;                 // 증가값
		}
		System.out.println(sum);     
	}

	// 3시 시작합니다.
}
