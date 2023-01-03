package ch02.contorl;


/**
 * @Date : 2023. 1. 3. 
 * @Author : 강사
 * @Description : 제어문 - 반복문 (while, do~while 차이점)
 */

public class Exam22 {
	public static void main(String[] args) {
	
		int x=20;
		
		while(x > 50) {     // 20 > 50
			System.out.println("while:" + x);   
		}
		
		do {
			System.out.println("do:" + x);    // 20
		}while(x > 50);    // 20 >50

	}

}
