package ch01.dataType;



/**
 * @Date : 2023. 1. 2. 
 * @Author : 강사
 * @Description : 6. 삼항연산자 : 조건식 ? 참:거짓
 *                       7. 대입연산자 : =, +=, *=. /=, !=.... 등등
 *                       8. 후위형 증감연산자 : su++, value--
 *                       9. 컴마(순차) 연산자
 */
public class Exam08 {
	public static void main(String[] args) {
		// 삼항연산자
		int a=10;
		System.out.println(a==10 ? "T":"F");

		int b=20;
		int c=30;
		int d=b!=c ? b:c;
		System.out.println(d);
		
		// 대입연산자
		int i=100;
		System.out.println(i+=2);    // i=i+2  102
		System.out.println(i-=2);    // 100
		System.out.println(i*=2);   // 200
		System.out.println(i/=2);   // 100
		
		// 순차연산자
		int x=10, y=20, z=30;
		
		int su=10;
		int value=20;
		System.out.println(su);    // 10
		System.out.println("su:" + value);   // 문자열 출력
		System.out.println("su:" +  su  + "\t" + "value:" + value);
		System.out.println("결과:" + (su + value));
	}
}


















