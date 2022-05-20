package chap03;

public class Array_02 {
	public static void main(String[] args) {
		int[] c = {100,200,300,400,500,600};
		for(int i=0;i<c.length;i++) {
			System.out.println("c["+i+"]"+c[i]);
		}
		int[] d = c; //c의 값을 d에 저장/ c와 같이 같음
		for(int i=0;i<d.length;i++) {
			System.out.println("d["+i+"]"+d[i]);
		}
		////////////////////////////////////////////
		//#배열 1~100까지의 합
		int arr[],sum=0; //arr은 배열이구 sum은 변수이므로
		arr = new int[100];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
			sum += arr[i];
		}
		System.out.println("arr의 합="+sum);
		
		//실제 배열에 있는 값 출력
		for(int i=0;i<arr.length;i++) {
			System.out.printf("arr[%3d]=%3d\n",i,arr[i]); //3자리로 출력 = %3d
		}
	}
}
