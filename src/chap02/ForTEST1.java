package chap02;

import java.util.Scanner; 

public class ForTEST1 {
/*
 * #for 문
초기값 부여
누적되는값

정수는 초기값 0;
실수는 초기값 0.
string는 초기값  "" 으로 세팅
 int i =0 초기값
 * */
	public static void main(String[] args) {
		//FOR문
		int sum=0; 
		for(int i=0;i<=5;i++) { // (가로안)은 지역변수가 됨,수식을 ;으로 구분한것 총 3개의 수식
			sum+=i;//sum = sum+i;		//오른쪽 sum계산해서 왼쪽으로 대입, sum의 값이 같을때 단축으로 씀
		}
		System.out.println("합은" + sum);
		/*for문 밖에 쓰인것은 전역변수이므로 아래의 for문에도 영향을 주므로 
		 * 하단 합은 10을 담고있으므로  다른 변수를 쓰거나 sum을 초기화 시켜줘야한다
		*/
		
		///1부터 50까지 5의 배수의 합////	
		int sum2 = 0;
		for(int i=1;i<=50;i++) {
			if(i%5 ==0) { //5로 나눴을때 나머지가 0일때
				sum2 += i;
			}		
		}//end for
		System.out.println("1에서 50까지의 합은"+sum2);
		
		////소수인지 아닌지 판단하는 프로그램////
		
		/* 1.입력형식
		 * 2.값입력
		 * 3. 5는 소수다 (결과 예)
		 * 4. 8은 소수가 아니다 (결과 예) //8은 2,4,8 로 나누어 떨어지고 나머지로 안떨어짐 //나머지가 0이 아닐때
		  */
		System.out.println("소수인지 아닌지 판단하는 프로그램");
		Scanner  sc = new Scanner(System.in); //입력을 받기 위한 변수 선언
		System.out.print("값 입력:");
		int num = sc.nextInt();

		for(int i=2;i<num;i++) {
			if(num%i == 0) {
				System.out.println(num+" 소수아님");
				return; //단독 if문일때 값이 나올때 종료처리 //하단의 소수를 타지않음
			}
		}
		System.out.println(num+" 소수");
		
		///하단 모양 출력하기(스캐너 구문을 주석해야지 아래의 결과가 출력됨)///
		
		/*
		 * 
		 **
		 ***
		 ****
		 *****
		 */
		
		int height = 5;
		for(int i= 0;i<height;i++) { //행이 5개 반복
			for(int j=0;j<=i;j++) { //열 *출력
				System.out.print("*"); //j=0,k=1;
			}
			System.out.println();
		}
	}
}

















