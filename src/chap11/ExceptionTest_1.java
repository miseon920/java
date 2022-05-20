package chap11;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * 예외 (p.278)
 * 복구할 수 있는 에러
 *  
  */
public class ExceptionTest_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int num1=0,num2=0,res=0;
		boolean bool=false;
		do{
			try { //예외가 발생할 가능성이 있는 문장 코드를 try 안에 넣음
				/*1.자료형이 맞지 않을때 
				 * 2.분모가 0일때
				 * */
				System.out.print("정수입력 : ");
				num1=sc.nextInt();
				System.out.print("정수입력 : ");
				num2=sc.nextInt();
				bool = false;
			}catch(InputMismatchException e) {
				sc.nextLine();
				//e.printStackTrace();
				bool = true;
			}
		}while(bool);
		try{
			res = num1/num2;
			
		}catch(ArithmeticException e) {
			res = num1;
		}finally{ //
			System.out.println("예외종료");
		}
		System.out.println(num1+"/" +num2 +"=" + res);
		
		/*catch(Exception e) { //예외 발생시 catch문에서 처리 - 다중으로 사용할수 있음
			e.printStackTrace(); //- 아래방식과 같음 보여주는것이 다름
			//2.System.out.println(e.getLocalizedMessage());
			//System.out.println("예외발생"); 
			//위의 방식으로 예외 방식을 찾아서 캐치문에 추가함
*/		System.out.println("***********");
		//InputMismatchException : 자료형이 맞지 않을때 뜸
		System.out.println("예외강제발생");
		System.out.println("프로그램 시작");
		
		try {
			throw new Exception("예외발생"); //예외 강제발생
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료");
		
		//떠넘기기는 throws 로 떠넘긴다 - 예외를 처리하는 부분
	}
}
