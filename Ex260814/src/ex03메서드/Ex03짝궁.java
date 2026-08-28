package ex03메서드;

public class Ex03짝궁 {

   public static void main(String[] args) {

      // 메서드 호출(info)
      info("고선아");
      info("고선아",20);
      info("고선아",20, "ISTP");
      
      
   }
   // 메서드 오버로딩이란?
   // -> 메서드 이름은 같지만 매개변수를 다르게 함으로써
   //    서로 다른 메서드를 만드는 기법
   
   
   // 매개변수 : 이름 
   // 접근제한자 public static 반환타입 없음
   //1. 짝궁의 이름만 출력하는 메서드
   public static void info(String name) {
      System.out.println(name);
   }
   
   // 매개변수 : 이름, 나이(int) 
   // 접근제한자 public static 반환타입 없음
   //2. 짝궁의 이름과 나이를 출력하는 메서드
   public static void info(String name, int age) {
      System.out.println(name + "," + age);
   }
   
   // 매개변수 : 이름, 나이(int) , MBTI
   // 접근제한자 public static 반환타입 없음
   //3. 짝궁의 이름과 나이와 MBTI를 출력하는 메서드
   public static void info(String name, int age, String MBTI) {
      System.out.println(name + "," + age + "," + MBTI);
   }
     

}
