package ch01.dataType;



/**
 * @Date : 2023. 1. 2. 
 * @Author : 강사
 * @Description : 2. 단항 연산자 : !(부정), ~(이진부정 ), +/-, ++(전위형), 
 *                                             cast 또는 (자료형)
 */

public class Exam04 {
	public static void main(String[] args) {
		byte a=10;
		short b=a;       // 묵시적형변환
		System.out.println(a + "\t" + b);
		
		int x=10;
		short y=(short) x;		// 명시적형변환
		System.out.print(x + "\t" + y);
		
		
		int su=10;
		int value=3;
		int hap=su+value;
		int mul=su*value;
		float div=(float) su/value;      // 10.0f (float)su/value,     su/(float)value 3.0f
		System.out.println(hap);
		System.out.println(mul);
		System.out.println(div + "\n");
		
		int kor=88;
		int eng=99;
		int mat=86;
		int tot=kor+eng+mat;
		float avg=(float) tot/3; 
		System.out.println(avg);
		
		// 4시 26분 시작합니다.
	}
}









