package chap02;

public class ForTest4 {
///break///
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			System.out.println("i="+i);
			for(int j=0;j<5;j++) {
				if(j==2)break; //j가 2일경우 더이상 타지않음
				System.out.println("j="+j);
			}
			System.out.println();
		}
	}

}
