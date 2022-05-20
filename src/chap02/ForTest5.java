package chap02;

public class ForTest5 {
	///continue///
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			System.out.println("i="+i);
			for(int j=0;j<5;j++) {
				if(j==2)continue; //j가 2일경우만 빼고 진행
				System.out.println("j="+j);
			}
			System.out.println();
		}
	}
}
