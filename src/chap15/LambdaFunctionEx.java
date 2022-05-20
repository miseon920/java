package chap15;
//p.416
/*람다는 인터페이스에서 
 * 추상메서드가 단 한개만 존재해야
 * 람다식으로 객체를 생성할 수 있음 - 인터페이스는 객체 생성이 되지않아 하위에게 상속해줘야함
 */
interface InterfaceEx{
	public int sum(int x,int y);
}

public class LambdaFunctionEx {
	public static void main(String[] args) {
		InterfaceEx ie =(int x,int y) -> x+y; //매개변수가 없을시 ()가로안에 안써도 됨
		int res=ie.sum(100, 200);
		System.out.println(res);
	}
}
