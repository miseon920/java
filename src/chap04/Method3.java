package chap04;

import java.util.Scanner;

public class Method3 {
	
	public static int add(int num1,int num2) {
		int sum =0;
		for (int i = num1;i<=num2;i++) { //조건을 더 추가할수 있음(예: num1>num2보다 크다면 교환해라!)
			sum+=i;
		}
		return sum;
	}	
			
	public static void main(String[] args) {
		/*1~100 합을 메서드로 작성*/
		int num1=1,num2=100;		
		int res = add(num1,num2); //호출하는 쪽에 값을 반환
		//add(num1,num2); //피호출쪽에 값을 출력한다
		System.out.printf("%3d에서 %3d까지의 합은=%3d", num1,num2,res);
	}
}
