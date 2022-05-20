package chap09;

public class ComplexerTest {

	public static void main(String[] args) { //실행부
		// TODO Auto-generated method stub
		Complexer com = new Complexer(); //객체생성
		System.out.println(Complexer.INK); //상수를 객체없이 클래스명으로 직접호출
		System.out.println(Complexer.Fax_NUMBER);//상수를 객체없이 클래스명으로 직접호출
		com.print();
		com.scan();
		com.send("010-444-5555");
		com.receive("010-555-4444");
	}
}
