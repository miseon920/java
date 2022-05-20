package chap11;

public class ExceptionTest_2 {
	public static void main(String[] args) {
		try {
			first();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	static void first() throws Exception{ 
		// TODO Auto-generated method stub
		second();
	}

	static void second() throws Exception{ //예외 떠넘기기
		// TODO Auto-generated method stub
		throw new Exception("예외발생"); //예외발생
		
	}
}
