package ch02.contorl;


/**
 * @Date : 2023. 1. 3. 
 * @Author : 강사
 * @Description : 제어문 - 반복문 : do~while
 */

public class Exam21 {
	public static void main(String[] args) {
		// 1~10  숫자 출력
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println();
		
		int cnt=1;
		while(cnt <=10) {
			System.out.println(cnt);
			cnt++;
		}
		System.out.println();
		
		int count=1;
		do {
			System.out.println(count);   // 1 2 3
			count++;                          //  2 3 4
		}while(count <=10);              //  4 <= 10
		System.out.println("\n");
		
		// 1~10 합
		int isum=0;
		for(int i=1;i<=10;i++) {
			isum +=i;
		}
		System.out.println(isum);
		
		int wsum=0;
		int i=1;
		while(i<=10) {
			wsum +=i;
			i++;
		}
		System.out.println(wsum);
		
		int dsum=0;
		int j=1;
		do {
			dsum +=j;
			j++;
		}while(j <=10);
		System.out.println(dsum);
	}
}

















