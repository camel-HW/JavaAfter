package ch02.contorl;



 /**
 * @Date : 2023. 1. 3. 
 * @Author : 강사
 * @Description : 제어문 - 조건문 : switch ~ case
 */

public class Exam15 {

	public static void main(String[] args) {
		int su=12;
		
		switch(su) {     	// switch(4) 정수형, 문자형 가능   / if(true 또는 false)
		case 1:
			System.out.println("1번임");
			break;           // 가장 가까운 블럭 빠져나간다.
		case 2:
			System.out.println("2번임");
			break;
		case 3:
			System.out.println("3번임");
			break;
		case 4:
			System.out.println("4번임");
			break;
		default:
			System.out.println("1~4 까지만 출력됩니다.");
			break;
		}
		
		System.out.println();
		
		if(su==1) {
			
		}else if(su==2) {
			
		}else if(su==3) {
			
		}else if(su==4) {
			
		}else {
			
		}
		
		}
}









