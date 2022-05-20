package chap09;

public class InstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			A a = new AAA();
			A b = new ABB();
			AAA aaa = new AAA();
			
			System.out.println("a > A : " +(a instanceof A));
			System.out.println("b > A : " +(b instanceof A));
			System.out.println("aaa > AB : " +(aaa instanceof AB));
	}

}
