package chap15;

interface Lambdainterface3{
	void print(String name); //인터페이스는 상수와 추상메서드만 사용가능
}
public class LambdaEx3{
	public static void main(String[] args) {
		Lambdainterface3 li3 = (String name)->{
			System.out.println("이름 = "+ name);
		};
		li3.print("홍길동"); //값을 넘김
	}
}
