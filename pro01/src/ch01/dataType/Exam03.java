package ch01.dataType;


/**
 * @Date : 2023. 1. 2. 
 * @Author : 강사
 * @Description :  2. 단항 연산자 : !(부정), ~(이진부정 ), +/-,
 *                                               ++(전위형), cast 또는 (자료형)
 */
public class Exam03 {
	
	public static void main(String[] args) {
	
		int x=10;
		x++;			// 후위형 증감연산자
		++x;			// 전위형 증감연산자
		System.out.println(x);
		
		--x;
		x--;
		System.out.println(x + "\n");
		
		int y=20;
		int z=++y;    // y++
		System.out.println(z);
		System.out.println(y + "\n");
		
		int su=10;
		int value=20;
		int hap=++su + value--;
		System.out.println("hap:" + hap);
		System.out.println("su:" + su);
		System.out.println("value:" + value);
	}
}














