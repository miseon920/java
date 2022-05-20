package chap05;

public class Car { //자동차가 가지는 특징 
	//클래스는 설계도면
	//속성
	/*
	 * class Car은 클래스를 만들때마다 최상위 클래스 object
	 * 최상위 클래스인 Car로 부터 자동 상속됨 
	 */
	private String color;
	private String company;
	private String type;
	
	//접근지정자 private는 사적인 접근이므로 다른곳에서 호출불가
	//private는 속성 메서드로 접근해야한다.(예:get,set) get은 값 가져오기 set은 값 저장하기
	
	//☑car 생성자를 만든적은 없지만 자동으로 컴파일 되어서 추가되었다고 사라진다.
	//☑하지만 지금은 하단처럼 초기화되어 null값이 박혀있음!
	public Car() { //기본생성자 메서드
		//this - this는 무조건 첫줄에 써야함
		this(null,null,null); //기본값
		
		System.out.println("생성자메소드()");
		System.out.println("색상" + color);
		System.out.println("제조회사" + company);
		System.out.println("종류" + type);
	}
	//오버로딩 -중복함수 : 메서드는 같아도 매개변수를 달리해서 사용할수 있다.
	public Car(String _color) {  //오버로딩1
		this("blue","",""); //this 생성자로 써도됨
		//setColor(_color); 		//하단방식의 코드가 중복되므로 호출방식으로 사용한다. 하단방식으로 써도되긴함;
		//color=_color;
		
		//#3가지 방식으로 쓸수있음! 호출은 CarTest에서 확인!
	}
	
	public Car(String _color,String _company) {  //오버로딩2
		this("red","기아","");
		//color=_color;
		//company=_company;
	}
	
	public Car(String _color,String _company,String _type) {   //오버로딩3
		//매개변수 갯수나 type 다르게 같은 메서드명을 사용할수있다.
		setColor(_color); //color = _color;
		setColor(_company); //company = _company;
		setColor(_type); //type = _type;
	}
	
	//Car 클래스 안에 속성이 있으므로 매개 변수가 필요없다. 출력방식2
	public void carDisplay2() { //값 출력
		System.out.println("색상" + color);
		System.out.println("제조회사" + company);
		System.out.println("종류" + type);
	}
	
	public String getColor() { //첫머리 글자는 대문자 getColor에서 C를 뜻함
		return color;
	}
	public void setColor(String color) { 
		this.color = color; 
		//this는 객체 복사본 - 자기자신의미 , 현재 클래스안에 있는 컬러 
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void go() {
		System.out.println("전진");
	}
	public void back() {
		System.out.println("후진");
	}
	//접근지정자 public은 대중적인 접근이므로 다른곳에서 호출가능

	@Override //출력방식3 그대로 상속됨
	public String toString() {
		return "Car [color=" + color + ", company=" + company + ", type=" + type + "]";
	}
	
	
}
