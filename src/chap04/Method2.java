package chap04;

import java.util.Scanner;

public class Method2 {
	public static void main(String[] args) {
		int num1,num2,sum=0;
		System.out.print("num1=");
		num1=getInt();
		System.out.print("num2=");
		num2=getInt();
		 sum=add(num1,num2); //sum=num1+num2;
		//add2(num1,num2); //void 이므로 위의 형식으로 쓸수없음! 하지만 결과값이 수식에 참여하므로 이방법을 쓰면안됌
		 
		float avg = sum/2.F;
		
		//System.out.printf("%s","홍길동점수"); //현재 홀길동 점수라고 쓴부분은 변수로 써도 되고 직접써도됨
		String str ="홍길동 점수";
		System.out.printf("%s\n",str); //printf는 줄바꿈 기능이 없으므로 \n을 써줌으로써 줄바꿈을함
		System.out.println(num1+"+"+num2+"="+sum);
		System.out.printf("%5d+%5d=%5d",num1,num2,sum); //위의 형식과 같음 더 편함
		//문자열은 s,실수형은f,정수형은 d,연산자는c
		System.out.printf("평균=%.2f",avg);
	}
	
	public static int getInt() { //저장하는것은 set 읽는것은 get으로 보통사용
		Scanner sc=new Scanner(System.in);
		return sc.nextInt(); //입력받는것은 보통 메서드를 만들어서 사용하고 리턴값을 줘라
	}
	
	public static int add(int num1,int num2) {
		return num1+num2;
	}
	/*
	public static void add2(int num1,int num2) {
		int sum=num1+num2;
		System.out.println("합="+sum);
	}
	*/
}
