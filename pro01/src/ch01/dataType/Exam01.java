package ch01.dataType;

/*
 * 날짜 : 23-01-02
 * 작성자 : 강사
 * 설명 : 자료형
 * 			숫자 : 정수형(byte, short, int, long)
 * 					 실수형 (float, double)
 * 			문자 : char
 * 			문자열 : String - 나중 배운다. 클래스
 * 			논리형 : boolean
 * */

public class Exam01 {
	public static void main(String[] args) {	
		System.out.println("hahahahaha");	
		
		System.out.println("정수형 자료형");
		byte a=10;       		// 1byte -128~127
		short b=128;			// 2byte -32768 ~ 32767
		int c=1000;			// 4byte -2147483648 ~ 2147483647
		long d=6580L;		// 8byte (-2^63 ~ 2^63-1)
		System.out.println("a값:" + a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d + "\n");
		
		System.out.println("실수형 자료형");
		float e=45.5f;				// 4byte 
		double f=120.40;
		System.out.println(e + "\t\t" + f);    		 // \t 서식문자 : tab 기능
		System.out.println();     // \n
		
		System.out.println("문자형 자료형");
		char x='A';						// 2byte
		char y='김';
		System.out.println(x + "\t" + y + "\n");     // \n 서식문자 :  줄바꿈
		
		System.out.println("문자열 자료형 - 클래스/객체");
		String str1="Hello Java";          // 무한 참조형
		String str2="안녕하세요. 추워요~~";
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("논리형 자료형");
		boolean b1=true;        // 1
		boolean b2=false;       // 0
		System.out.println(b1);
		System.out.println(b2);
		
		// 40분 시작.. 각자 디버그 연습 
		// 안되면 챗팅주세요.
	}
}













