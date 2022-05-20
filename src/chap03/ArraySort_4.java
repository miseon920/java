package chap03;
	// 배열정렬
/*
 * #배열값 정렬

값 자리마다 하나씩 비교해서 교환 - 반복해서 순차적으로 비교해감
 * */
public class ArraySort_4 {
	public static void main(String[] args) {
		int[] num= {5,4,3,2,1}; //값세팅
		int temp=0; //임시변수
		System.out.println(" 정렬전 배열");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+"\t"); //간격 크게 띄우기 \t   - 배열값불러오기
		}
		System.out.println();
		System.out.println("정렬 후 배열");	
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) { //비교하는 첫번째는 것을 제외하기 때문에 i+1이 됨
				if(num[i] > num[j]) {
					temp=num[i]; //교환 - 비교하는것이 다음것보다 클경우 교환
					num[i]=num[j];
					num[j]=temp;
				}//end if
			}// end for_j
			System.out.print(num[i]+"\t"); 
		}//end for_i
	}
}
