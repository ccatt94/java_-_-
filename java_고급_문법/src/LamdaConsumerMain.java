import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LamdaConsumerMain {

	public static void main(String[] args) {

		Consumer<String> fruit = (String s) -> {System.out.println(s);};
		
		List<String> list = new ArrayList<>();
		list.add("사과");
		list.add("배");
		list.add("키위");
		
		list.forEach(fruit);
		System.out.println();
		list.forEach((s) -> {System.out.println(s);});
		System.out.println();
		list.forEach((s) -> {System.out.println(s.length());});
		
		
		System.out.println("=================================================");
		Consumer<String> c = (String s) -> {System.out.println(s);};
		
		c.accept("하이");
		c.accept("사과");
		c.accept("배");
		
		Consumer<Integer> star = (num) -> {
			
			for(int i = 1 ; i <= num ; i++) {
				for(int j = 1 ; j <= i ; j++) {
				System.out.print("★");
			};
			
			System.out.println();
			};
			
		};
		
		star.accept(3);
		star.accept(5);
		
		Consumer<String> fileDeleter = (String filePath) -> {
			
			File file = new File(filePath);
			if(file.delete()) {
				System.out.println("파일 삭제 완료:" + filePath);
			}else {
				System.out.println("파일 삭제 안됨 " + filePath);
			}
		};
		
		fileDeleter.accept("b.txt");
 		
		
		
	}
}
