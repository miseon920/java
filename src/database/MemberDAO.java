package database;
//DAO(Data Access Object):데이터 베이스 정의 - 다오

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MemberDAO {
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@127.";
	private static final String user = "scott";
	private static final String pwd = "tiger";	
	
	Connection conn=null;
	Statement stmt = null; //쿼리만들기
	ResultSet rs = null;
	
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
	
	//public MemberVO
}	
