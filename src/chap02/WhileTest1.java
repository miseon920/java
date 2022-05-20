package chap02;

import java.util.Scanner;

/*
 *
 #반복문 개념

1.자료 입력
2.자료 검색
3.자료 삭제
4.자료 변경
5.종료


#반복문 종류
1.while    
2.do while
3.for : 시작값, 종료값이 정해져 있을때 사용


*while문과 do while문은 비슷하므로 보통 while문 사용
- 두가지는 종료값이 확실하지 않을때 사용한다!

 * */
import java.util.Scanner;
public class WhileTest1 {

	public static void main(String[] args) {
		/*
		 while(조건식){ 조건식의 참이면 실행 - 거짓시 실행안함		
		 if문은 한번하고 종료를 해버리기 때문에 반복문을 쓴다.
		}
	*/
		Scanner sc = new Scanner(System.in);
		String res="";	
		while(true) {
			System.out.print("점수입력 : ");
			int num = sc.nextInt();
			if(num == -99999)
				break;  //반복문 종료 break 사용 //입장조건
			if(num %2 == 0) 
				res=num+"은 짝수";
			else
				res=num+"은 홀수";
			System.out.println("결과 : "+ res);
		}
	}
}
