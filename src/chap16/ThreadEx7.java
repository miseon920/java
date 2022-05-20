package chap16;

public class ThreadEx7 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i =0;i<10;i++) {
					System.out.println("t1 : "+i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO: handle exception
					}
				}
				System.out.println("스레드 실행종료");
			}
		});
		t1.start();
	}
}
