package ch02.contorl;


/**
 * @Date : 2023. 1. 3. 
 * @Author : 강사
 * @Description : 제어문 - 조건문 : 중첩 if
 */
public class Exam13 {
	public static void main(String[] args) {
		int num=150;
		
		if(num > 0) {
			if(num > 200) {
				System.out.println("양수이며 200보다 큰수입니다.");
			}else {
				System.out.println("음수이며 200보다 작은수입니다.");
			}
		}else {
			System.out.println("음수입니다.");
		}

	}

}
