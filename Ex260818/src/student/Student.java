package student;

public class Student {

	
	// 학생정보관리 프로그램 설계도
	
	// 1. 필드(public)
	// 이름 문자열
	// 나이 숫자
	// 자바점수 숫자
	// 웹점수 숫자
	// 파이썬점수 숫자
	
	private String name;
		
	private int age;
	
	private int java;
	
	private int web;
	
	private int python;

	// 생성자 자동완성 : alt + shift + s
	// Generate Constructor using fields
	public Student(String name, int age, int java, int web, int python) {
		//super();
		this.name = name;
		this.age = age;
		this.java = java;
		this.web = web;
		this.python = python;
	}
	
	
	//private 접근제한자 접근하기
	//alt+shift+s   Generator Getters and Setters
	
	//Getter 메서드
	// -> 클래스 내부에 있는 필드 값을 외부(다른클래스)에서 가져갈 수 있는 메서드
	public String getName() {
		return name;
	}
	
	//Setter 메서드
	// -> 클래스 내부에 있는 필드 값을 외부(다른클래스)에서 수정할 수 있도록 하는 메서드
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getWeb() {
		return web;
	}

	public void setWeb(int web) {
		this.web = web;
	}

	public int getPython() {
		return python;
	}

	public void setPython(int python) {
		this.python = python;
	}
	
	
	
	
	
	
	
}
