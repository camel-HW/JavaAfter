package ch02.contorl;


/**
 * @Date : 2023. 1. 3. 
 * @Author : 강사
 * @Description : 제어문 - 조건문 : if ~ else
 */

public class Exam10 {
	public static void main(String[] args) {
		int a=-25;
		if(a > 0) {     // -25 > 0
			System.out.println("양수입니다.");
		}else {
			System.out.println("음수입니다.");
		}
		
		String str=a > 0 ? "양수": "음수";   // 삼항식
		System.out.println(str);
		
		if(a%2==0) {    // -25%2 == 0
			a+=100;			// a=a+100
			System.out.println(a + "는 짝수입니다.");
		}else {
			a *=200;		// a=a*200
			System.out.println(a + "는 홀수입니다.");
		}
		
		int score=50;
		if(score >=50) {
			System.out.println(score + "점수는 합격입니다.");
		}else {
			System.out.println(score + "점수는 불합격입니다.");
		}
	}
}












