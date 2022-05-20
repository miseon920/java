package chap02;

import java.util.Scanner;

public class ForTest2 {
/*
 * 1. 입력받기 (1~100까지)
 * 첫번째수 = ;
 * 두번째수 =;
 * 배수= ;
 * 
 * 2.출력
 * 1부터 100까지의 배수의 합은?
 * 
 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //sc는 객체
		System.out.print("첫번째 수:");
		int num1 = sc.nextInt();
		System.out.print("두번째 수:");
		int num2 = sc.nextInt();
		System.out.print("배수:");
		int n = sc.nextInt();		
		
		int sum=0;
		if(num1>num2) {
			int temp=num1;
			num1=num2;
			num2=temp;
		for(int i=num1;i<=num2;i++) {
			if(i%n == 0) {
				sum+=i; //합
			}
		}//end for
		System.out.println(num1+"~"+num2+"의 배수의 합"+sum);
		}
		
		
		

	}

}
