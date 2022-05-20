package chap03;

import java.util.Scanner;

public class ArrayMaxMin_03 {
	public static void main(String[] args) {
		//정수형 배열5개 선언 후 최대 최소를 구하세요.
		Scanner sc= new Scanner(System.in); //입력받기
		int[] arr = new int[5];
		System.out.println("정수입력");
		 
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt(); //값 5개
		}
		//최대 최소값 구하기  - 기준값이 있어야하므로 세팅해준것	
		int max= arr[0];
		int min = arr[0]; 
		
		for(int i=1;i<arr.length;i++) { //위의 [0]값을 지정했으므로 1부터 시작
			if(max<arr[i]) {
				max= arr[i]; //max값이 다음값보다 작으므로 계속 비교해서 큰값을 추출
			}
			if(min>arr[i]) {
				min=arr[i]; //min값이 다음값보다 작으므로 min은 처음 비교한값이되고 중간에 더작은수를 만나면 그값이 작은값이됨
			}
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
		
	}
}
