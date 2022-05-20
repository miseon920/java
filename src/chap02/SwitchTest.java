package chap02;

public class SwitchTest {
	public static void main(String[] args) {
		
		int number=5;
		String str="";
		
		switch (number) { //key = case 문의 value와 같음 switch (key) = case value:
		/*현재 number이 key 부분에 들어가서 case의 value와 비교하는것
		 * 아닐경우가 있으므로 break 를 반드시 써주어야함 기타 나머지는 defalut에 씀
		 *  */
		case 1:
			str = "1반";
			break;
		case 2:
			str = "2반";
			break;
		case 3:
			str = "3반";
			break	;
		case 4:
			str = "4반";
			break	;
		case 5:
			str = "5반";	
			break;	
		default:
			str="기타";
			break;
		}
		System.out.println("반 :" +str);
		
		int score=95;
		String grade="";
		
		
		switch (score/10) {
		case 10:
			grade="A";
			break;
		case 9:
			grade="B";
			break;
		default:
			break;
		}
		System.out.println(grade);

	}
}
