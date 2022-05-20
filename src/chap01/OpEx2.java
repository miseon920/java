package chap01;
/*
 * 조건식은 비교연산자, 논리연산자 구성
 * 
 * 제어문 : 조건문 / 반복문
 * 조건문 :  if/else
 * 반복문:while
 * 제어구조: 절차적 <->객체지향
 * 
 * */
public class OpEx2 {

	public static void main(String[] args) {

		int num1=100,num2=100;

		num1++;

		++num2;

		System.out.println("num++="+num1);

		System.out.println("++num="+num2);

		int x,y;

		x=++num2;//num2=num2+1; y=num2;

		System.out.println("x="+x+",num2="+num2);

		y=num1++;//y=num1;num1=num1+1;

		System.out.println("y="+y+",num1="+num1);

		int a=100;

		//a++;

		a+=1;//a=a+1;

		System.out.println("a="+a);

		int b=200;

		b+=1;

		System.out.println("b="+b);

		b+=3;

		System.out.println("b="+b);

		b-=3;

		System.out.println("b="+b);

		int z=5,res;

		if(z==0)//5==0

			res=x;

		else

		res=x/z;

		System.out.println("res="+res);

		int temp=100;

		if(temp>=80)//50>=80 false

			System.out.println("동작 멈춤");

		else

			System.out.println("동작중");

		System.out.println(temp>80);

		int x_value=10,y_value=5;

		System.out.println(x_value>y_value);

		System.out.println(x_value>-y_value);

		System.out.println(x_value<y_value);

		System.out.println(x_value<=y_value);

		System.out.println(x_value==y_value);

		System.out.println(x_value!=y_value);

		System.out.println("--------------------------------");

		System.out.println(x_value>y_value&&x_value==10);

		System.out.println(x_value>y_value&&x_value==y_value);

		System.out.println(x_value>y_value||x_value==y_value);

		System.out.println("--------------------------------");

		int score=60;

		String pass= score>=60?"합격":"불합격";

		System.out.println(pass);

		

		String weight=67.5+"";

		weight=weight+10;

		System.out.println("체중="+weight);

		double weight2=Double.parseDouble(weight)+10;

		System.out.println("체중2="+weight2);

		final int SEC_PER_MINUTE=60;

		int input=1000;

		int minute=input/SEC_PER_MINUTE;

		int second=input%SEC_PER_MINUTE;

		System.out.println("1000초는"+minute+"분"+second+"초");

		System.out.printf("%6d초는%2d분%2d초\n",input,minute,second);

		System.out.printf("%6d초는%2d분%2d초\n",input,minute,second);

		System.out.printf("%6d초는%2d분%2d초\n",input,minute,second);

		System.out.printf("%6d초는%2d분%2d초\n",input,minute,second);

		System.out.printf("%6d초는%2d분%2d초\n",input,minute,second);

		System.out.printf("%6d초는%2d분%2d초\n",input,minute,second);

	

		

	}

 

}