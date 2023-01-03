package ch02.contorl;

/**
 * @Date : 2023. 1. 3. 
 * @Author : 강사
 * @Description : 제어문 - 조건문 : if
 */

public class Exam09 {
	public static void main(String[] args) {
		int x=20;
		if (x > 10) {    // 20 > 10 T,  9 > 10 F
			System.out.println("10보다 큰수입니다.");
		}
		System.out.println("hahaha");
		
		int y=50;
		if(y > 0 &&  y < 100) {   // 50 > 0 && y < 100
			y+=200;			// y=y+200;
			System.out.println(y);   // 250
		}
	}
}


