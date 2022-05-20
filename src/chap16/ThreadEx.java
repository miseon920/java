package chap16;
class ThreadExtend extends Thread{
	public void run() {
		System.out.println("Thread 상속");
		for(int i=0;i<50;i++) {
			System.out.println("Threadend:" + i);
		}
	}
	
} //스레드 상속
class RunnableImpl implements Runnable{

	@Override
	public void run() {
		System.out.println("Runnable 상속");
		for(int i=0;i<50;i++) {
			System.out.println("RunnableImpl:" + i);	
		}
	}
}
public class ThreadEx {
	public static void main(String[] args) {
		ThreadExtend t1=new ThreadExtend();
		Runnable r=new RunnableImpl();
		
		Thread t2 = new Thread(r); //스레드 생성
		t1.start();
		t2.start();
	}
}
