package chap02;

import java.util.Scanner;

/*1.국어점수입력(범위 0~100) //벗어날때 다시 입력하기
 * 2.수학점수 입력(범위 0~100)
 * 3.합과 평균 구하기
 * 4.평균에 따라서 학점부여(A~C) 
 * */
public class ForTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor,math,sum=0;
		long total=0L; //정수보다 클때 long로 쓰며 L을 붙여줘야한다.
		float avg=0.F;
		
		
		do { //무조건 최소한 한번 실행! true이면 반복
			System.out.print("국어="); //enter기능이 없을때는 print를 쓴다. println은 enter기능
			kor =  sc.nextInt();
		}while(kor<0 || kor>100);//()은 조건식
		/*
		 * while문이 true이므로 do를 반복함
		 * */
		do{
			System.out.print("수학=");
			math = sc.nextInt();
		}while(math<0 || math>100);
		
		sum=kor+math;
		avg=sum/2.F; //90.00으로 나오므로 바꿈
		char grade =' ';
		
		switch((int)avg/10) { //정수나 문자로 와야하므로 avg를 바꿔준것
			case 10:
			case 9 :
				grade = 'A';
				break;
			case 8 :
				grade = 'B';
				break;
			case 7 :
				grade = 'C';		
				break;
		    default:
		    	break;
		}
		System.out.println("총점:" + sum);
		System.out.println("평균:" + avg);
		System.out.println("학점:" + grade);
	}

}
