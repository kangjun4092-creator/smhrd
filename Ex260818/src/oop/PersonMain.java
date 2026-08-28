package oop;

public class PersonMain {

   public static void main(String[] args) {

      // 설계도를 사용하는 공간
      // 설계도를 사용하는 방법
      // 클래스명 변수명 = new 클래스명();
      
      Person p1 = new Person();
      
      System.out.println(p1); // 주소값확인(저장되어 있는 위치)
      
      // 객체에 값에 접근 시 : .점연산자 사용
      // 점 연산자 사용했을 때 앞에 나오는 도형
      //세모 : 필드(데이터), 동그라미 : 메서드(객체의 행위, 기능)
      System.out.println(p1.name); //null
      
      // 값을 설정
      p1.name = "강준";
      p1.age = 20;
      p1.gender = "남성";
      p1.address = "광주";
      p1.hairColor = "검은색";
      
      
      
      
      
      
      System.out.println(p1.name);
      System.out.println(p1.age);
      System.out.println(p1.gender);
      System.out.println(p1.address);
      System.out.println(p1.hairColor);
      
      p1.talk();
      p1.eat();
      
      
      // 1. 짝꿍의 정보를 담은 객체 p2 만들기
      // 매개변수가 있는 생성자를 이용할 수 있도록 변경!
      
      Person p2 = new Person("강준",30,"검은색","남성","광주");
      
      
      // 2. 필드 값을 설정
      
//      p2.name = "강준";
//      p2.age = 30;
//      p2.gender = "남성";
//      p2.address = "광주";
//      p2.hairColor = "검은색";
      
      System.out.println(p2.name);
      System.out.println(p2.age);
      System.out.println(p2.gender);
      System.out.println(p2.hairColor);
      System.out.println(p2.address);
      
      
      
      
      
      
      
      
      
   }

}