package chap11; //p.291

public class LoginException extends Exception{ //Exception로 부터 상속받기
	public LoginException(String msg) {
		super(msg); //상위 메서드의 생성자 메서드를 호출
	}
	
}
