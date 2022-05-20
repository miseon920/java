package chap01;

/*대입연산 */
public class OpEx1 {
	public static void main(String[] args) {
		int number=100;
		number += 100; //number = number + 100;
		System.out.println(number);
		number -= 100;
		System.out.println(number);
		number*=100;
		System.out.println(number);
		number /=100;
		System.out.println(number);
		number %= 3;
		System.out.println(number);
		
		//오른쪽 값을 왼쪽에 대입해라 %은 나머지 개념
		
		/*증감연산*/
		
		int a=10,b=10;
		++a; //전위연산자(연산자가 앞에 오는것! 먼저 변수에 1을 증가함)
		b++; //후위연산자(연산자가 뒤에 오는것! 나중에 변수에 1을 증가함)
		
		System.out.println(a);
		System.out.println(b);
		
		int num1 = 100,num2=100;
		
		int c = ++num1;
		int d = num2++; //num2가 먼저 대입되서 d는 100이되는것
		
		System.out.println("c=" + c);
		System.out.println("num1=" + num1);
		System.out.println("d=" + d); 
		System.out.println("num2=" + num2); 
		
		
	}
}
