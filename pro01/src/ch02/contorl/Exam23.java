package ch02.contorl;



/**
 * @Date : 2023. 1. 3. 
 * @Author : 강사
 * @Description : 제어문 - 반복문 (break, continue)
 */

public class Exam23 {
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			if(i==5) {
				break;		// 가장 가까운 블럭 밖으로 빠져나간다. (if문 제외)
			}
			System.out.println(i);
		}
		System.out.println();
		
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue;		// 가장 가까운 블럭 밖으로 빠져나간다. (if문 제외)
			}
			System.out.println(i);
		}
	}
}








