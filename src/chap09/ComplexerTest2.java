package chap09;

public class ComplexerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fax fax = new Fax() {
			@Override
			public void send(String tel) {
				// TODO Auto-generated method stub
				System.out.println("익명 send");
				
			}

			@Override
			public void receive(String tel) {
				// TODO Auto-generated method stub
				System.out.println("익명 receive");
				
			}
		}; //익명구현 개체는 세미클론을 꼭 붙여줘야함
		fax.send("1234");
		fax.receive("5678");
	}

}
