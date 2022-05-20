package chap03;
//이차원 배열
public class Array_05 {

	public static void main(String[] args) {
		int total=0;
		int[][] arr= {{0,1,2,3},
							   {4,5,6,7},
							   {8,9,10,11}
							  }; //2차원 배열 초기값 세팅
		System.out.println("arr.lenth = " + arr.length); //각행
		System.out.println("arr[0].length = " + arr[0].length); //각행의 열
		System.out.println("arr[1].length = " + arr[1].length);
		System.out.println("arr[2].length = " + arr[2].length);
		
		/*total=arr[0][0]+arr[0][1]+arr[0][2]; //~12개까지 적어야하는 불편함;
		System.out.println(total);*/
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) { //arr[i].length각행의 열이므로! 잘봐야함!
				total+=arr[i][j];
				//값출력
				System.out.println("배열값 출력 arr["+i+"]["+i+"] = "+arr[i][j]+"\n");
			}
		}//end for
		System.out.println("total = "+total);
		
		////////예제문제
		int[][] num;
		num=new int[4][4];
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
				if(i+j<4) {
					num[i][j] =2; //작을때 2로 세팅
				}else {
					num[i][j] =0; //크면 0으로 세팅
				}
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		} //end for
			
		//출력
		/*for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
				System.out.print(num[i][j]+"\t");
				
			}
			System.out.println();
		}//end for*/
		
		/////합구하기 예제문제
		int sum=0;
		int[][] arr2= {{2,3,8},
								{8,9,1},
								{7,0,5}
							  };
		//행의 합을 구하기
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				sum+=arr2[i][j];
			}
			System.out.println(i+1+"행의 합은"+sum);
			sum=0; //각행을 더하기 후 초기화 시켜줘야지 이전 합이 사라지므로!
		}
		
		System.out.println();
		
		//열의 합을 구한다
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				sum+=arr2[j][i];
			}
			System.out.println(i+1+"열의 합은"+sum);
			sum=0; //각열을 더하기 후 초기화 시켜줘야지 이전 합이 사라지므로!
		}
	}
}
