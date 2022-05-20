package chap11;

import java.util.Scanner;

public class UserExceptionTest {
	static String user_id = "misuuun";
	static String user_pw = "kim";
	public static void main(String[] args) {
		/*if(!user_id) {
			System.out.println("아이디가 잘못되었습니다.");
		}*/
		//위의 방식보다는 예외를 만듬
		try {
			Scanner sc= new Scanner(System.in);
			System.out.print("아이디 :" );
			String input_id = sc.nextLine();			
			System.out.print("비밀번호 :" );
			String input_pw = sc.nextLine();			
			if(!user_id.equals(input_id)) { //equals =같다라는뜻 !이 붙었으므로 not이됨(=같지 않을때)
				throw new LoginException("아이디가 올바르지않음"); //출력대신 던지기/예외가 발생하는 문을 써서 던지기!  
				//LoginException.java에 있는 메서드
			}else if(!user_pw.equals(input_pw)) { 
				throw new LoginException("패스워드가 올바르지않음"); 
			}else {
				System.out.println("로그인 성공");
			}
		} catch (Exception e) { //예외처리
			// TODO: handle exception
			e.getMessage();
		}
	}
}
