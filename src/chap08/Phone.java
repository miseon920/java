package chap08;
/*
#상속 : 공통 부분을 분리하여 재사용

A = B (문장 만들기)

#객체생성 순서 : 부모부터 생성
super,super() : 슈퍼 메서드
override(재정의)
생성자 메서드는 상속 불가 (생성자 메서드 : 객체 초기화 / 필드초기화) - 기본생성자


#전화기 : 규격(부모가 규격이 된다)
스마트폰은 전화기다
다이얼 전화기는 전화기다
dmb전화기는 전화기다

*/
public class Phone { //부모객체

	//private String name;
	protected String name;
	protected String color;
	protected String company; 
	/*protected는 패키지가 다르면 접근이 안됌 -필드 직접 접근이 됨
		private 패키지가 같아도 안됌
	*/
	public Phone() {} //매개변수가 없는것도 정의 해줘야함
	public Phone(String name,String color,String company) {
		setName(name); //this.name=name; - 해당코드는 setName() 메서드에 있으므로 중복되므로 왼쪽과 같이 적어야함 
		setColor(color);
		setCompany(company);
	}
	
	
	//private이므로 속성메서드로 접근해야함
	
	public String getName() { 
		return name; //속성메서드 가져오기
	}
	public void setName(String name) { //속성메서드 저장
		this.name = name;
	}
		
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.color = company;
	}
	//폰의 기본정의
	public void call() {
		System.out.println("전화를 건다");
	}
	public void receive() {
		System.out.println("전화를 받는다");
	}
	public void hangUp() {
		System.out.println("통화종료");
	}
}
