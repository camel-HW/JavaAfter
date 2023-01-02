package ch01.dataType;


/**
 * @Date : 2023. 1. 2. 
 * @Author : 강사
 * @Description : 5. 논리연산자 : 이진(비트) 논리연산자 : &, |, ^
 *                                            일반논리연자 : &&, ||
 */

public class Exam07 {
	public static void main(String[] args) {
		byte a=10;
		byte b=2;
		// 10: 0000 1010
		// 2  : 0000 0010
		// ^ ------------------
  
		System.out.println(a & b);   // 2 : 0000 0010
		System.out.println(a | b);    // 10 : 0000 1010
		System.out.println(a ^ b);   // 8 : 0000 1000 
		System.out.println();
		
		int su=15;      // 관계와 논리연산자가 같이 많이 사용한다.
        boolean x=su > 10 && su < 20;        // 15 >10 && 15 < 20
        boolean y=su==10 || su==15;           // 15==10 | 15==15
        System.out.println(x);
        System.out.println(y);
	}
}









