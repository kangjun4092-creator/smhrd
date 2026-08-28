package ex_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCTest {

	public static void main(String[] args) {

		//JDBC(Java Database Connectivity)
		// - Java 에서 Database 로 연결할 때 사용되는 기술
		
		// JDBC 연결 순서
		// 1. JDBC Driver 로딩
		// - ojdbc6.jar 를 프로젝트에 추가
		// - Class.forName() 메소드를 통해서 동적 로딩 + 예외처리(try ~ catch() 문)
		//     url = "jdbc:oracle:thin:@  까지는 고정  호스트이름 : 포트 : SID"
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";  //맨뒤  OracleDriver  는 클래스 이름
		String user = "hr";
		String password = "12345";
		
		//try ~ catch 문
		// - 실행할 로직에 대한 예외처리를 작성하는 구문
		// - try 문 : 실행할 로직을 작성
		// - catch 문 : 예외(오류) 발생 시에 실행할 로직을 작성
		
		Connection conn = null;
		PreparedStatement pst = null;
		
		
		
		try {
			
			Class.forName(driver);
		
			// 2. Database 연결
			// - Connection 객체를 통해서 데이터베이스에 연결
			conn = DriverManager.getConnection(url, user, password);
			
			if(conn != null) {
				System.out.println("DB연결성공!");
			}else {
				System.out.println("DB연결실패..");
			}
			
			
			// 3. SQL 쿼리문 실행
			// - PreparedStatement 객체를 통해서 SQL 쿼리문을 세팅 및 실행
			String sql = "insert into t_member values(?,?,?)";
			
			pst = conn.prepareStatement(sql);
			pst.setString(1, "smhrd2");
			pst.setString(2, "스인개");
			pst.setInt(3, 10);
			
			// SQL 쿼리문에 따른 메소드 호출
			// - DB에 변경을 일으키는 쿼리문인 경우 : pst.executeUpdate();
			// 반환타입 : 정수 (성공 : row count / 실패 : 0)
			
			// - DB 정보를 조회(select)하는 쿼리문인 경우 : pst.executeQuery();
			// 반환타입 : ResultSet 객체
			int cnt = pst.executeUpdate();
			
			if(cnt > 0) {
				System.out.println("데이터 저장 성공!");
			}else {
				System.out.println("데이터 저장 실패....");
			}
			
			
		} catch (Exception e) {
			// 어떤 오류인지 메시지를 출력해주는 메소드
			e.printStackTrace();
			
		} finally {
			// try ~ catch 문과 별개로 무조건 실행되어야 하는 로직을 작성하는 구문 
			// 4. 모든 자원 종료
			
			try {
				if(pst != null) {pst.close();}
				if(conn != null) {conn.close();}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
