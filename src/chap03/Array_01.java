package chap03;
/*
 * 
#배열

1. []로 표시
2. [i]= ; i는 변하는 수
3. 배열은 반복문과 같이 씀! 배열은 무조건 0부터 시작
4.배열은 집합체이므로 이름을 붙여줘야한다.(변수라고 안함)
-서로 관련성이 있는것들의 모임 //배열은 동일한 자료형의 집합체
for(int i=0;i<5;i++)

//형식
int[] score = new int[10];
정수형 배열 = 새로운 정수형 배열 10개 생성
score[0] = 홍길동;
score[1] = 홍길동;
.
.
.
.
score[10] = 홍길동;
  
 #동적배열: 본인이 입력한 칸만큼 저장하는 배열방식
 */
public class Array_01 {

	public static void main(String[] args) {
		/*배열선언방법
		 * 1.자료형 배열명[],자료형[] 배열명
		 * 2. 사용자 정의 자료형(집합체이므로 단일변수 취급을 못함) ->heap 영역 (사용자 정의 공간) <->반대 Stack 영역
		 * #따라서 단일변수로 취급할경우 
		 * 3.배열명 = new 자료형[갯수]
		 * 4.초기화 int a=0; 배열명[index(위치)] = 값;      
		 */
		
		////#1배열선언////
		int[] arr = new int[3]; //int[] arr;arr=new int[3]; 왼쪽은 정의와 동시에 생성, 우측은 정의따로 생성따로
		//arr은 배열이름!
		//메모리에 3개의 공간이 생성됨(초기화되어) |_0_|_0_|_0_|  <-이거처럼
		//값을 넣으면 |_100_|_200_|_300_|
		//							0			1				2        <-순서 (배열은 무조건 0번부터!)
		
		//#2배열에 값을 대입//
		arr[0] = 100;//int arr1 = 100;
		arr[1] = 200;//int arr2 = 200;
		arr[2] = 300;//int arr3 = 300; 
		//우측은 변수가 3개 생성되어서 복잡함... 따라서 왼쪽처럼 사용하는것이 편함
		//arr[3] = 400; //오류, 3개만 생성하기로 했으므로
		
		//#3 데이터 불러오기//
		System.out.println("arr[2]=" + arr[2]);
		System.out.println("arr의 크기 = " +arr.length); //배열의 갯수
		
		double arr2[]=new double[5]; //실수형 배열생성, 값 5개 생성
		int num = 0;
		System.out.println("arr2[3] = " + arr2[3]); //값이없으므로 초기값 0.0 출력
		System.out.println("arr2의 크기="+arr2.length);
		
		//#4.배열의 초기화//
		int c[] = {100,200,300,400,500,600}; //선언시 값 대입
		System.out.println("배열명 c의 주소="+c);
		System.out.println("c[0] = "+c[0]); 
		int len = c.length; //c배열의 갯수=6
		
		for(int i=0;i<len;i++) {
			System.out.println("c["+i+"]="+c[i]); //위의 갯수와 값을 불러올때 반복해서 같은것을 쓰므로 반복문으로 처리
		}
		
		c= new int[3];
		System.out.println("배열명 c의 주소="+c); //16진수가 출력됨 //생성될떄마다 다르게 생성됨
		for(int i=0;i<c.length;i++) {
			System.out.println("c["+i+"]"+c[i]); //위에 c배열을 새로 선언했으므로 3개가 나온다
		}
		
		int[] d = new int[7];
		for(int i=0;i<d.length;i++) {
			System.out.println("d["+i+"]"+d[i]);
		}
		
		//#5.배열교환//
		int temp[]; // 임시 
		temp=c;
		c=d;
		d=temp;
		System.out.println("----------------------------------");
		for(int i=0;i<c.length;i++) {
			System.out.println("c["+i+"]"+c[i]);
		}
		System.out.println("----------------------------------");
		for(int i=0;i<d.length;i++) {
			System.out.println("c["+i+"]"+d[i]);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
