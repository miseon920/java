package chap09;
/*
 * 인터페이스 : 서로 다른 객체가 공통의 메서드를 가지고 있는것
-객체의 제안서
-객체를 쉽게 쓰기 위해 쓴다

인터페이스와 추상클래스는 무조건 상속을 준다.
 
 #프린트 기능
 출력,스캔,팩스,wifi
 */

public class Complexer implements Print,Scanner,Fax {
	
	//복합기 기능 
	//Print,Scanner,Fax보다 더 많다면 더 추가하면 된다. 
	//무조건 상속되므로 오버라이드 처리해야함

	@Override
	public void send(String tel) {
		// TODO Auto-generated method stub
		System.out.println(Fax_NUMBER+"에서"+tel+"로 전송");
		
	}

	@Override
	public void receive(String tel) {
		// TODO Auto-generated method stub
		System.out.println(Fax_NUMBER+"에서"+tel+"로 수신");
		
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("스캔");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("출력");
		
	} //복합기 만들기
	
	
}
