package oop;

public class Person {

	
	
			//1. 필드(데이터 값)
			// 이름, 나이, 머리색, 성별, 주소
			
			String name;
			int age;
			String hairColor;
			String gender;
			String address;
			
			//2. 메서드(객체의 행위, 기능)
			// 말하다, 숨쉬다
			
			
			// 생성자
			// -> 객체를 생성하는 순간에 실행되는 메서드
			// -> 필드에 있는 데이터를 객체로 생성하는 순간에 초기화(초기값)를 시켜줄 수 있도록 로직 생성
			
			// 생성자의 특징
			// 1) 리턴 타입 지정하지 않는다(void도 작성 안함)
			// 2) 생성자의 이름 클래스와 동일(대소문자까지)
			// 3) 매개변수가 없는 생성자를 기본 생성자라고 부름
			// 	단, 새로운 생성자 만들게 되면 기본 생성자는 덮어씌어진다.
			
			// 매개변수와 전달인자 : 데이터 자료형, 개수, 순서 일치
			public Person(String name, int age, String hairColor, String gender, String address) {
				//매개변수로 받아온 데이터를 필드에 초기화
				  // 변수 명이 같은 경우, 가장 근접한 곳에 있는 변수에 접근
				//this : 현재 클래스를 지정하는 키워드
				this.name = name;
				this.age = age;
				this.hairColor = hairColor;
				this.gender = gender;
				this.address = address;
			
			
			}
			
			public Person() {
				
			}

			
			public void talk() {
				System.out.println(name + "이(가) 말한다");
			}
			
			public void eat() {
				System.out.println(name + "이(가) 점심은 마라샹궈를 먹는다~~");
				
			}
			
			
			
	
	
}
