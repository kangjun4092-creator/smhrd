package ex_jdbc.model;

public class T_Member {
	
	private String m_id;
	private String m_name;
	private int m_age;
	
	
	public T_Member() {}
	
	
	public T_Member(String m_id, String m_name, int m_age) {
		super();
		this.m_id = m_id;
		this.m_name = m_name;
		this.m_age = m_age;
	}
	
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	
	public int getM_age() {
		return m_age;
	}
	public void setM_age(int m_age) {
		this.m_age = m_age;
	}

	// 객체 내 데이터를 출력하기 위한 목적으로 사용
	// toString() 을 생성하지 않으면? "클래스이름@숫자+알파벳" 형식의 주소값이 출력
	@Override
	public String toString() {
		return "T_Member [m_id= " + m_id + ", m_name= " + m_name + ", m_age= " + m_age + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
