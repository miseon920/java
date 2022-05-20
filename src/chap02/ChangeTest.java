package chap02;

public class ChangeTest {

	public static void main(String[] args) {

		int x= 100,y=200;
		int temp=x; //temp 임시변수를 만들때 주로사용
		x=y;//x=200;
		y=temp; //y=200;
		System.out.println("x="+x+"y="+y);
	}

}
