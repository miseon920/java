package chap04;

import java.util.Scanner;

/* 
#메서드(c언어에서는 함수라고 칭함 / 자스에서도 함수)
public<->Private
☑자주사라용하는 기능을 미리 만들어놓고 불러서 사용하는 개념
☑메서드는 인수를 받아 결과값을 리턴(반환)하는 작은 프로그램
 -계산식, 메서드의 결과 값이 다른 수식에 참여할때 무조건 리턴해야함
+리턴값이 없을때 void라고 적음/ 잇을경우 자료형을 적어주어야함
+나누어서 기능을 정의함
+값은 변수에 들어있는것
☑메서드는 메인과 별개로 만들어야함!
☑메모리를 저장하기 전에 공간을 만들어야해서 static를 쓰는것임! 
*/
public class Method1 {
	//명령어는 메서드 안에 무조건 작성
	public static void printLine(String str) { 
		//메서드 만들기! 리턴값이 없으므로 void,값이 변하지 않음 / 피호출 - 호출당하는쪽
		//문자열을 매개변수로 사용!
		//System.out.println("----------------------");
		for(int i=1;i<=20;i++) {
			System.out.print(str);
		}
		System.out.println();
	}
		
	public static void printWord(String name, int age) { //두가지를 전달할때 콤마로 구분하며 순서대로 써야함
		System.out.print("이름:"+name+", 나이:"+age);
		System.out.println();
		/*기능단위로 나뉘어서 관리 = 모듈*/
	}
	
	public static int getInt() { //값을 얻기 때문에 void가 아닌 get을 사용
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num; //리턴형과 getInt 자료형이 같아야함
	}
	
	public static void printScore(int score,int score2) {
		System.out.println("국어="+score+", 수학="+score2);
	}
	
	public static void main(String[] args) {		
		runMain();
	}
	public static void runMain() {
		printLine("*"); //호출기능 - 호출과 피호출 형태가 같아야함!
		printWord("Hello",23);
		printLine("!");
		printWord("Hello java",25);
		printLine("=");
		printWord("web",30);
		printLine("*");
		
		System.out.println("국어점수 : ");
		int kor = getInt();
		System.out.println("수학점수 : ");
		int math = getInt(); //입력을 받음:입력동작
		
		//System.out.println("국어="+kor+", 수학="+math);
		printScore(kor,math);	
	}
	
}
