package chap08;

public class SmartPhoneTest {

	public static void main(String[] args) {
		Phone p = new SmartPhone();
		
		SmartPhone sp = new SmartPhone();
		String name="";
		sp.setName("갤럭시"); //값을 저장
		
		sp.name="갤럭시2";
		sp.setColor("blue");//sp.color="white";
		sp.company = "삼성";

		System.out.println(sp.getName());
		System.out.println(sp.color);
		System.out.println(sp.getColor());
		System.out.println(sp.company);
		
		System.out.println(sp);
		
		sp.installApp();
		p.call();
		
		Phone phone = new SmartPhone(); //부모에게 상속받은 자식의 객체 - UpCasting
		SmartPhone sp2 = (SmartPhone)phone; //DownCating -자식의 이름으로 맞추는것
		sp2.installApp();
		Phone pPrent = new Phone();
		Phone phone2 = new SmartPhone("갤럭시","노랑색","애플"); //인자로 전달 
		sp.call(); //자식의 것이 우선순위가 높다
	}

}
