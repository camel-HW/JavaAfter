package ch02.contorl;



/**
 * @Date : 2023. 1. 3. 
 * @Author : 강사
 * @Description : 제어문 - 반복문 다중 for
 */

public class Exam19 {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {						// 1, 2, 3
			for(int j=1;j<=5;j++) {                // 12345, 12345, 12345
				System.out.println(i + "\t" + j);
			}
			System.out.println();
		}
		System.out.println();

		for(char i='A';i<='Z';i++) {        // A,B,C,D,E~~~~~Z
			for(char j=i;j<='Z';j++) {      // A~Z, B~Z, C~Z
				System.out.print(j);
			}
			System.out.println();
		}
		
		// for문 수치 반복, 배열의 index
		// while, do ~ while 문 행단위 레코드 반복할 때 
	}
}









