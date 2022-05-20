package chap02;

import java.util.Scanner;

public class Iftest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수입력 : ");
		int score = sc.nextInt();
		String grade = "";
		// Scanner을 사용 안할시
		
		int math=90,eng=95;		
		String str="";		
		System.out.println("학점부여 시작");
		if(score>=95) {
			grade = "A+";
		}else if(score >=90) {
			grade = "A";
		}else if(score >=85) {
			grade = "B+";
		}else {
			grade ="B";
		}
		if(math>=60 && eng>=60)
			str="합격";
		else 
			str="불합격";
		
		System.out.println("합격여부 : "+str);
		System.out.println("학점은 "+grade);
		System.out.println("프로그램 종료");
	}
	
	/*클래스명은 앞글자 대문자로! 까먹지 말기 ㅠㅠ*/
}
