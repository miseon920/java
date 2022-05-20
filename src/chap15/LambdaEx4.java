package chap15;
//매개변수와 리턴값이 있는경우
/*
 * 람다식
 * 1.인터페이스 만들기
 * 2. 상속해주고 오버라이딩과 매우 비슷
 * 
 * */
@FunctionalInterface
interface LambdaInterface{
	 int cal(int x,int y);
}

public class LambdaEx4 {
	public static void main(String[] args) {
		LambdaInterface f4 = (x,y)->{
			return x*y;
		};
		System.out.println("두수의 곱은"+f4.cal(2, 4));
		
	}
	static int sum(int x,int y) {
		return x+y;
	}
}
