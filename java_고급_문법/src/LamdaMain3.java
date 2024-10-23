
@FunctionalInterface
interface Calculate2<T>{
	T cal(T a, T b);
}

//람다란? 인터페이스(이때 인터페이스 안에 반드시 익명 함수 한개만 있어야함) 구현을 화살표 함수로
public class LamdaMain3 {

	public static void main(String[] args) {

//		Calculate2<Integer> cal = (Integer a, Integer b) -> {
//			
//			return a + b;
//			
//		};
		
		Calculate2<Integer> cal = (a, b) -> a + b;
		System.out.println(cal.cal(3, 4));

		Calculate2<Character> cal2 = (Character a, Character b) -> {
			
			if((int)a >= (int) b) {
				return a;
			}
			
			return b;
			
		};
		
		System.out.println(cal2.cal('A', 'a'));
		
	}
}
