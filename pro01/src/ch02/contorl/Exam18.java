package ch02.contorl;



/**
 * @Date : 2023. 1. 3. 
 * @Author : 강사
 * @Description : 제어문 - 반복문 (for) 
 */

public class Exam18 {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			if(i%2==0) {    // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
				System.out.println(i);
			}
		}
		
		// 1~10 합을 구하세요.
		int hap=0;
		for(int i=1;i<=100;i++) {   // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
			hap += i;				// hap 15 =hap 10 + i 5;
		}
		System.out.println(hap);
		
		int sum=0;
		for(int i=100;i<=200;i++) {
			if(i > 150 && i < 200) {
				sum += i;      // sum=sum+i
			}
		}
		System.out.println(sum);
	}
}













