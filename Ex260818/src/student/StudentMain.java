package student;

public class StudentMain {

	public static void main(String[] args) {

		// 학생정보관리 프로그램 설계도를 실행하는 공간
		
		
		
		// student stu1이라는 객체 하나 생성하기
		// stu1 의 자료형은 Student // Scanner sc 랑 같은개념
		
		Student stu1 = new Student("강준",30,70,80,90);
		
		
//		System.out.println("이름 : " + stu1.name);
//		System.out.println("나이 : "+stu1.age);
//		System.out.println("java점수 : "+stu1.java);
//		System.out.println("web점수 : "+stu1.web);
//		System.out.println("python점수 : "+stu1.python);
		
		
		
		System.out.println(stu1.getName());
		System.out.println(stu1.getAge());
		System.out.println(stu1.getJava());
		System.out.println(stu1.getWeb());
		System.out.println(stu1.getPython());
		
		stu1.setName("홍길동");
		System.out.println(stu1.getName());
		
	}

}
