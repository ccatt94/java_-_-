
//Optional은 if null 회피하기 위해 나온 문법
//null 체크 -> 프로그램을 죽이는 이유들 중 가장 큰 이유
//NPE(NullPointerException) => null 체크 함

import java.util.Optional;

public class OptionalMain2 {
	

	public static void main(String[] args) {
		
		Optional<String> os1 = Optional.of("Optional String");
		
		Optional<String> os2 = os1.map(s->s.toUpperCase());
		
		System.out.println(os2.get());
		
 		
	}
}
