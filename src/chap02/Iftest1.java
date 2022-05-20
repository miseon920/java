package chap02;

import java.util.Scanner; //외부에 있는것을 호출시 import 사용(패키지위치 / 클래스 이름)

public class Iftest1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //키보드로 입력
		System.out.print("정수입력 : ");
		int number = sc.nextInt(); //키보드에서 정수 입력받기
		//sc는 참초변수:메모리에 있는변수
		
		//int number=-1000;
		if(number < 0) {
			number=-number; //-1*number	
			System.out.printf("절대값 %d",number); //format 형식 : printf("",);
		}else 
			System.out.println("양수" + number);
		
		/*형식지정 : %
		 * 규격이 있는것을 나타낼때  printf
		 */
		
		/*자료입력 종류(클래스 = 집합체) - 단일이 아님 다인일의 집합체 / 사용자 정의 데이터/heap 영역(사용자 정의 공간:메모리)
		 * 
		 * 정수형 int - 자료정류
		 * 실수형 double float 자료종류
		 * 문자열 
		 * 문자
		 * 논리형
		 * 
		 * 자료종류 : Scnner(정수형,실수형 등등) / scnner 사용시 package부터 시작해야함 
		 * 객체를 생성 : new 연산자 사용 /객체가 모여서 클래스를 만듬
		 * 클래스 설계가 되어야 객체를 생성할 수 있음
		 * #형식 : 클래스 참조 변수=new 클래스();
		 * #사용방식 : 참조변수.속성메소드()
		 * 
		 * 
		 * */

		
	}

}
