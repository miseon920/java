package chap01;

public class Arith {
	/*
	 * 변수 =  값을 담아두는 공간 (값이 하나이므로 재정의됨) / 단일변수
	 * 정수 = 소수점이 없는 숫자
	 * 실수 = 소수점이 있는 숫자
	 * 정수 < 실수   
	 * 정수 + 실수  = 실수
	  	자료형 변수명 = 초기값;
	  	수식 = 값,변수,수식
	  	예)
	  	kor = 100;
	  	number = 90;
	  	number = kor; //수식
	  	순서대로 진행하므로 number은 결론 100이 되게 된다.  	
	  	number = kor + 200; //수식
	  	순서대로 진행하므로 number은 결론 300이 되게 된다.
	  	int =  자료형
	  	a=0; 초기값세팅
	  	final - 고정형
	  	실수형 기본은 double이므로 float보다 더블이 크므로 float를 쓸때는 선언 후 F를 붙여 줘야 한다.;
	  	정수형에 long를 쓸때는 L을 붙여준다.
	  */
	public static void main(String[] args) {
		int kor = 100;
		int math = 100;
		kor = 95;
		int sum =0;
		float avg = 0.0F; // int sum =0,avg=0자료형이 같을때는 ,로 이어써도됌
		sum = kor + math; //새로운 변수 이므로 자료형을 선언해 주어야함 위에 선언
		avg =  sum/2.F; //(float)을 빼버리면 정수형이 되므로 97.0이 되어버림 
		/*
		 * (float)sum/2 로 쓰거나
		 * sum/2.F 로써야한다 (기본 .만 찍을 경우 double로 인식하므로 F를 붙여줘야한다.)	
		 * */
		System.out.println("국어:" +kor);
		System.out.println("수학:" +math);
		System.out.println("합:" +sum + "\n" + avg);
		//System.out.println("평균:" +avg);
		
		/*문자형*/
		char ch = 'A';
		System.out.println("A:" + ch);
		int nch = ch;
		System.out.println("nch:" + nch);
		System.out.println("ch+1:" + (nch+1));
		System.out.println("B:" + (char)(nch+1));
		System.out.println("ch+5:" + (char)(ch+5));
		//CHAR은 정수형도 되고 문자형도 된다
		
		/*문자형 : 사용자정의 String - 가리키는 값*/
		
		String name="홍길동";
		String name2 = null; //확정되지 않은값
		String name3 = "";
		name3 = name;//name의 주소(홍길동이 오는 것이 아니라 주소를 가지고 오는것!)
		System.out.println("name :" + name);
		System.out.println("name2 :" + name2);
		System.out.println("name3 :" + name3);
		
		/*상수*/
		final double PI=3.14159; //상수선언 final를 써준다 - 변수 반대 개념
		
		String str = "aa\ndddd\n";
		System.out.println(str);
		String title = "번호\t이름\n이메일\n주소\n";
		String line="--------------------";
		System.out.print(title);
		System.out.println(line);
		
		System.out.print("국어점수 :");
		System.out.println("수학점수 : ");
		
		//print는 있는그대로 출력 println은 줄바꿈을 하면서 출력한다
		
		String name4; //name4도 main 안에서만 쓰는 지역변수가 된다
		
		if(true) {
			name4="홍길동";
			String email="hong@kr.co"; //지역변수
		}
		
		/*
		 * if(true) 
			name4="홍길동";
		 
		  //실행문이 1줄인결우 {} 생략가능 2줄이상 일경우에는 무조건 써야함
		 * */
		
		String email = "aaaa"; //main안에있는 지역변수
		System.out.println("이름4 :" + name4);
		System.out.println("email :" + email); //main 안에서 호출하므로 aaa가 나옴
		
		
	}
}



