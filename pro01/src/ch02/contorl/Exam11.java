package ch02.contorl;


/**
 * @Date : 2023. 1. 3. 
 * @Author : 강사
 * @Description : 제어문 - 조건문 if ~ else if 
 */
public class Exam11 {
	public static void main(String[] args) {
		
		int num=52;
		int value=24;
		
		if(num > value) {     // num  24 > value 52
			System.out.println("num가 value보다 크다");
		}else if(num == value) {   // num  24 > value 52
			System.out.println("num와 value가 같다.");
		}else if(num < value) {     // num  24 < value 52
			System.out.println("num가 value보다 작다");
		}
	}
}










