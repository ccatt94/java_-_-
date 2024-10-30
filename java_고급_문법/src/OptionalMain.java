
//Optional은 if null 회피하기 위해 나온 문법
//null 체크 -> 프로그램을 죽이는 이유들 중 가장 큰 이유
//NPE(NullPointerException) => null 체크 함
import java.util.Optional;

public class OptionalMain {
	
	public static void isCheckNull(Object obj) {
		if(obj == null) {
			System.out.println("널입니다");
			return;
		}
		
		System.out.println(obj);
	}

	public static void main(String[] args) {
		
		Optional<String> os1 = Optional.of(new String("Toy1")); //null 허용 안함
		Optional<String> os2 = Optional.ofNullable(new String("Toy2")); //null 허용
		
		if(os1.isPresent()) {
			System.out.println(os1.get());
		}
		
		if(os2.isPresent()) {
			System.out.println(os2.get());
		}
		
		os1.ifPresent(s -> System.out.println(s));
		os2.ifPresent(System.out::println);

//		Object obj = null;
//		
//		isCheckNull(obj);
//		isCheckNull(new Object(



		
 		
	}
}
