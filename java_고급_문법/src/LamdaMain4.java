
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//람다란? 인터페이스(이때 인터페이스 안에 반드시 익명 함수 한개만 있어야함) 구현을 화살표 함수로
public class LamdaMain4 {

	public static void main(String[] args) {
		
		//예측, 예상

		Predicate<String> predicate = (String s) -> {
			
			boolean isTrue = false;
			
			isTrue = s.startsWith("A");
			
			return isTrue;
			
		};
		
		System.out.println(predicate.test("Asdfasdf"));
		System.out.println(predicate.test("Bye"));
		
		
		Predicate<Integer> predicate2 = (Integer i) -> {
			if(i % 2 == 0) {
				return true;
			}
			
			return false;
		};
		
		System.out.println(predicate2.test(4));
		System.out.println(predicate2.test(3));
		
		int[] arrNums = {4, 3, 2, 1};
		
		for (int num : arrNums) {
			System.out.println("숫자 : " + num + " 짝수대홀수:" + predicate2.test(num));
			System.out.println("====================================================");
			System.out.println("숫자 : " + num + " 짝수대홀수:" + isEven(num, predicate2));
			System.out.println();
		}
		
		List<Integer> list = Arrays.asList(1,5,7,9,11);
		
		int s;
		
		s = sum(n -> n%2 == 0, list);
		System.out.println("짝수 합" + s);
		
		s = sum(n -> n%2 != 0, list);
		System.out.println("홀수 합" + s);
		
		
	}
	
	public static int sum(Predicate<Integer> p, List<Integer> list) {
		int s = 0;
		
		for(int n : list) {
			if(p.test(n))
				s += n;
		}
		return s;
	}
	
	public static boolean isEven(int num, Predicate<Integer> p) {
		return p.test(num);
	}
	
}
