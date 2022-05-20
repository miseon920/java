package chap04;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1,num2;
		String name="";
		System.out.print("num1 = ");
		num1=sc.nextInt();
		System.out.print("num2 = ");
		num2=sc.nextInt();
		//개행문자가 포함되어있음,엔터및 맨앞으로 커서가 오는 것:\n\r
		sc.nextLine(); //개행문자를 처리하기위
		System.out.print("name = ");
		name=sc.nextLine(); //입력을 받은 후 리턴 후 다음으로 넘어갈때 사용
		
		System.out.println("num1="+num1+", num2="+num2);
		System.out.println("name="+name);
		
		//개행문자 : 줄바꿈시 커서가 맨앞으로 오는것
	}

}
