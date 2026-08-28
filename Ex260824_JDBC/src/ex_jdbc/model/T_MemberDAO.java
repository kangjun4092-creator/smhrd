package ex_jdbc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

// DAO ( Data Access Object)
// - 데이터베이스 연결, 쿼리문 실행 관련 기능을 관리하는 클래스
public class T_MemberDAO {

	private Connection conn = null;
	private PreparedStatement pst = null;
	private ResultSet rs;
	// 데이터베이스 연결기능
	public void connection() {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver"; 
		String user = "hr";
		String password = "12345";
	
		
		
	try {
		Class.forName(driver);
		
		// Database 연결
		// - Connection 객체를 통해서 데이터베이스에 연결
		conn = DriverManager.getConnection(url, user, password);
		
		if(conn != null) {
			System.out.println("DB연결성공!");
		}else {
			System.out.println("DB연결실패..");
		}
	 }catch (Exception e) {
			// 어떤 오류인지 메시지를 출력해주는 메소드
			e.printStackTrace();
			
		}
	}
	// 데이터베이스 종료
	public void close() {
		try {
			if(pst != null) {pst.close();}
			if(conn != null) {conn.close();}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 데이터 저장 기능
	public int insert(String m_id, String m_name, int m_age) {
		
		
		
		
		int cnt = 0;  //데이터베이스 insert문의 실행결과를 담는 변수
		try {
			connection();
			// 3. SQL 쿼리문 실행
			// - PreparedStatement 객체를 통해서 SQL 쿼리문을 세팅 및 실행
			String sql = "insert into t_member values(?,?,?)";
			
			pst = conn.prepareStatement(sql);
			pst.setString(1, m_id);
			pst.setString(2, m_name);
			pst.setInt(3, m_age);
			
			// SQL 쿼리문에 따른 메소드 호출
			// - DB에 변경을 일으키는 쿼리문인 경우 : pst.executeUpdate();
			// 반환타입 : 정수 (성공 : row count / 실패 : 0)
			
			// - DB 정보를 조회(select)하는 쿼리문인 경우 : pst.executeQuery();
			// 반환타입 : ResultSet 객체
			cnt = pst.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
			
			
		}finally {
			
			close();
			
		}
		
		return cnt;

		
		
		
	}
	public ArrayList<T_Member> selectAll() {
		
		
		// 데이터베이스에서 조회한 회원정보들을 보관하는 리스트 객체
		ArrayList<T_Member> mlist = null;
		
		try {
			connection();
			
			String sql = "select * from t_member";
			
			pst = conn.prepareStatement(sql);
			
			rs = pst.executeQuery();
			
			//rs.next() : ResultSet에 저장된 데이터를 조회하는 기능
			// - 한 행씩 이동시키면서 데이터가 있는지 확인
			// - 데이터가 있으면 true, 없으면 false 를 반환
			// - 몇 개의 데이터가 있는지 알 수 없기 때문에 while 문으로 실행
			
			mlist = new ArrayList<T_Member>();
			
			while(rs.next()) {
				
				//ResultSet에 저장된 데이터 접근방법
				//- 컬럼명으로 접근 : rs.getString("m_id")
				//- 컬럼 인덱스로 접근 : rs.getString(1)
				// * 컬럼 인덱스는 1부터 시작
				T_Member m = new T_Member(rs.getString(1),rs.getString(2),rs.getInt(3));
				mlist.add(m);
			}
			
		}catch(Exception e){
			e.printStackTrace();
			
		}finally {
			close();
		}
		
		
		return mlist;
	}
	public int update(T_Member member) {

		
		int cnt = 0;
		
		try {
			
			//실습1) DB연결 메소드 호출하기!
			
			connection();
			
			
			//실습2) update 쿼리문 작성
			//      - 쿼리문 실행 메소드 : executeUpdate() 사용
			//      - 수정할 컬럼: 이름, 나이
			//      - 수정할 회원 : 아이디 (where 조건절)
			
			
			String sql = "update t_member set m_name = ?, m_age = ? where m_id = ?";
			
			pst = conn.prepareStatement(sql);
			pst.setString(1, member.getM_name());
			pst.setInt(2, member.getM_age());
			pst.setString(3, member.getM_id());
			
			cnt = pst.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			//실습3) DB연결종료 메소드 호출하기
			close();
		}

		
		
		

		return cnt;
	}
	public int delete(String id) {

		int cnt = 0;
		
		try {
			
					
			connection();
			
						
			String sql = "delete from t_member where m_id = ?";
			
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			
			cnt = pst.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			close();
		}
		
		
		
		
		return cnt;
	}
	
	
	
	
	
	
	
	
}
