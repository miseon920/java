package chap08;

public class SmartPhone extends Phone {
	//Phone이라는 부모객체에서 상속받은 SmartPhone이라는 자식객체
	public void installApp() {
		System.out.println("앱설치");
	}
	public SmartPhone() {} //기본형 정의
	public SmartPhone(String name,String color,String company) { //매개변수형 정의
		//부모가 생성자 메서드를 쓸때는 아래 형식으로 써야함
		super(name,color,company); //첫번째 줄에 써주어야함
		
		//부모가 생성자 메서드를 안쓸때는 아래 형식으로 써도됨
		/*this.name=name;
		this.color=color;
		this.company=company;*/
	}
	//매개변수가 있을때는 기본이 먼저 먹으므로 기본형을 먼저 정의 해주는것;

	@Override
	public void call() {
		System.out.println("스마트 폰 전화 걸기");
	}
	//오버로딩은 중복 메서드
	@Override //재정의 : 부모의 메서드를 자식에 맞게 재정의 하는것 - 상속할때만 발생
	public String toString() {
		return "SmartPhone [name=" + getName() + ", color=" + color + ", company=" + company + ", toString()="
				+ super.toString() + "]";
	}}
