package database;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConDB {
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@127.";
	private static final String user = "scott";
	private static final String pwd = "tiger";	
	
	public static void main(String[] args) {

		Connection conn = null;

		try {
			Class.forName(driver);
			System.out.println("로딩 성공");
			conn=DriverManager.getConnection(url,user,pwd);
			System.out.println("연결 성공");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(conn !=null) {
				try {
					conn.close();
				}catch(Exception e2) {}
			}
		}
 	}
}
