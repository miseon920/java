package chap04;

import java.io.IOException;
import java.util.Scanner;

public class Method4 {
	public static void main(String[] args) {
		int num1,num2,tot=0;
		char op=0;
		System.out.print("num1=");
		num1=getInt();
		do{
			System.out.print("you(+,-,*,/,%)=");
			op=(char)getOP(); //char = (char)int
		}while(op!='+' && op!='-' && op!='*' && op!='/' && op!='%'); //조건식
		System.out.print("num2=");
		num2=getInt();
		switch(op) {
		case '+':
			tot = plus(num1,num2); //plus 메서드 사용
			break;
		case '-':
			tot = minus(num1,num2); 
			break;	
			default:
				System.out.println("잘못된 연산자 입력!!");
		}
		display(num1,op,num2,tot);
	}
	public static int getInt() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	public static int getOP() { //문자 한개 받기
		int op=0;
		try {
			op = System.in.read();//문자를 숫자로 바꿈=바스킷코드? byte 0~255까지 정수형이므로 char를 쓰면 안됌
			System.in.read(); //\n
			System.in.read(); //\r  
			//개행문자를 제거하기위해서 위 두가지를 기입해야함 //InputTest.java 참조
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return op;
	}
	public static int plus(int num1,int num2) {
		return num1+num2;
	}
	public static int minus(int num1,int num2) {
		return num1-num2;
	}
	public static int divided(int num1,int num2) {
		return num1/num2;
	}
	public static int multiplied(int num1,int num2) {
		return num1*num2;
	}
	public static void display(int num1,char op,int num2,int tot) {
		//System.out.print(num1+op+num2+tot);
		System.out.printf("%3d%c%3d=%3d\n",num1,op,num2,tot);
	}
}
