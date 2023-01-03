package ch02.contorl;


/**
 * @Date : 2023. 1. 3. 
 * @Author : 강사
 * @Description : 제어문 - 조건문 if ~ else if 
 */

public class Exam12 {
	public static void main(String[] args) {
		// 성적표 
		String name="홍길동";
		int kor=70;
		int eng=80;
		int mat=90;
		
		int tot=kor+eng+mat;
		float avg=(float) tot/3;

		String hankjum="";
		if(avg >=90) {   // 80 >= 90
			hankjum="수입니다.";
		}else if(avg >=80) {   // 80 >= 80
			hankjum="우입니다.";
		}else if(avg >=70) {
			hankjum="미입니다.";
		}else if(avg >=60) {
			hankjum="양입니다.";
		}else if(avg < 60) {
			hankjum="가입니다.";
		}
		
		System.out.println(name);
		System.out.println(avg + "\t" + hankjum);

	}

}












