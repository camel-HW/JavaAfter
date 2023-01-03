package ch02.contorl;


/**
 * @Date : 2023. 1. 3. 
 * @Author : 강사
 * @Description : 제어문 - 조건문 : 중첩 if
 */

public class Exam14 {
	public static void main(String[] args) {
		int score=84;    		 // A >=90 / A+ 100~97, A0 96~94, A- 93~90
		
		String grade="";
		if(score >=90) {
			if(score >=97) {
				grade="A+";
			}else if(score >=94 && score <=96 ) {
				grade="A0";
			}else if(score <= 93) {
				grade="A-";
			}
		}else if(score >=80) {
			if(score >=87) {
				grade="B+";
			}else if(score >=84 && score <=86) {
				grade="B0";
			}else if(score <=83) {
				grade="B-";
			}
			
		}else if(score >=70) {
			if(score >=77) {
				grade="C+";
			}else if(score >=74 && score <=76) {
				grade="C0";
			}else if(score <=73) {
				grade="C-";
			}
			
		}else if(score >=60){
			if(score >=67) {
				grade="D+";
			}else if(score >=64 && score <=66) {
				grade="D0";
			}else if(score <=63) {
				grade="D-";
			}			
			
		}else if(score < 60) {
			System.out.println("재수강!!!");
		}else {
			System.out.println("점수는 0~100 사이의 점수입니다.");
		}
		
		System.out.println(grade);
	}
}





