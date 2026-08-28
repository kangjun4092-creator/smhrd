package 객체_ArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// Address 객체를 담을 수 있는 ArrayList를 만들자
		
		ArrayList<Address> address = new ArrayList<Address>();
		
		address.add(new Address("강준", 30, "010-2237-4092"));
		address.add(new Address("정연희", 20, "010-1111-1111"));
		address.add(new Address("권은솔", 10, "010-2222-2222"));
		
		
		
		// 1. 강준(30세) : 010-2237-4092
		// 2. 정연희(20세) : 010-1111-1111
		// 3. 권은솔(10세) : 010-2222-2222
		for(int i = 0; i<address.size();i++) {
			
			String name = address.get(i).getName();
			int age = address.get(i).getAge();
			String tel = address.get(i).getTel();
			
			System.out.printf("%d. %s(%d세) : %s%n",i+1,name,age,tel);
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}//

}
