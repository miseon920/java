package chap05;

public class MemberMain {
	public static void main(String[] args) {
		//객체 생성 (주소=값 - 계산불가)
		MemberMain hong = new MemberMain(); //생성자메서드(자신의 클래스이름,객체초기화,new 뒤에것이 생성자 메서드)
		//new 로 생성하는 것은 사용자 정의 데이터 (배열과 클래스 두개 밖에 없음!) 
		//리턴타입이 없음
		
		System.out.println(hong); //주소 -> chap05.MemberMain@7d6f77cc
		MemberMain kim = new MemberMain();
		System.out.println(kim);//chap05.MemberMain@5aaa6d82 - 위의 hong과 다르다
		
		hong=kim; //대입가능
		
		if(hong == kim) {
			System.out.println("두 객체가 같다");
		}else {
			System.out.println("두 객체가 같지 않다");
		}
		
	}
}
