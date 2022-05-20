package chap05;

public class CarTest { //자동차만들기
	public static void main(String[] args) {
		Car car = new Car(); //클래스와 생성자메서드는 같아야함!!중요
		//왼쪽 Car : 클래스이름, 우측 Car();이 생성자 메서드, 왼쪽 car은 객체
		car.setColor("black"); //값저장 - .뒤에 오는것이 메서드(동작,기능)
		car.setCompany("마세라티");
		car.setType("중형차");
		String color = car.getColor();//car.getColor(); //값 리턴 -> 변수 필요
		String company = car.getCompany();
		String type = car.getType();
		carDisplay(color,company,type); //main 하단에 있는 것을 가져온것
		car.carDisplay2(); // Car 클래스에 있는것을 가져온것
		//////////////////////////////////////////
		Car car0 = new Car("yellow");
		Car car1 = new Car("blue","재네시스"); 
		//출력
		System.out.println(car0);
		System.out.println(car1);
		
		/*생성자 메서드에 값(매개변수)을 넣어서 초기화시키기*/ //생성자오버로딩
		Car car2 = new Car("white","K7","SUV"); 
		color = car2.getColor();
		company = car2.getCompany();
		type = car2.getType();
		carDisplay(color,company,type);
		car2.carDisplay2();
		
		//출력방식3
		System.out.println(car.toString());
		System.out.println(car2);
		
	}
	
	//반복되므로 메서드로 만들어서 사용, 출력방식1
	public static void carDisplay(String color,String company,String type) { //값 출력
		System.out.println("색상" + color);
		System.out.println("제조회사" + company);
		System.out.println("종류" + type);
	}
}
