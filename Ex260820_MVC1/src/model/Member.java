package model;


// Model
// 프로그램에서 사용할 데이터를 담당하는 클래스
public class Member {

	private String id;
	private String name;
	private int age;



	public Member(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}



	public String getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}
	
	
	
	
	
	
	
	
	
	
}
