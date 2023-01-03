package ch02.contorl;


/**
 * @Date : 2023. 1. 3. 
 * @Author : 강사
 * @Description : 제어문 - 조건문 : switch ~ case
 */

public class Exam16 {
	public static void main(String[] args) {
		char a='B';
		
		switch(a) {            // if(a=='B' | a=='b'){... }
		case 'W': case 'w':
			System.out.println("White");
			break;
		case 'B': case 'b':
			System.out.println("Blue");
			break;
		case 'Y': case 'y':
			System.out.println("Yellow");
			break;
		case 'R': case 'r':
			System.out.println("Red");
			break;
		}
	}
}








