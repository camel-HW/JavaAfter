package ch01.dataType;

/**
 * @Date : 2023. 1. 2. 
 * @Author : 강사
 * @Description : 3. 산술연산자 : *, /, %, +, -
 */

public class Exam05 {
	public static void main(String[] args) {
		int x=10;
		int y=3;
		int sum=x+y;
		int cha=x-y;
		int mul=x*y;
		float div=(float) x/y;
		int rest=x%3;
		
		System.out.println("합:" + sum);
		System.out.println("차:" + cha);
		System.out.println("곱:" + mul);
		System.out.println("나눗셈:" + div);
		System.out.println("나머지:" + rest);
	}
}






