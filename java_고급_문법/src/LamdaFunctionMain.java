
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


class Student{
	int kor;
	int eng;
	int math;
	String name;
	
	public Student(int kor, int eng, int math, String name) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.name = name;
	}
	
}

//Function<T, R>
//R apply(T)
public class LamdaFunctionMain {

	public static void main(String[] args) {
		
		List<Student> sArr = new ArrayList<Student>();
		sArr.add(new Student(90, 80, 70, "홍길동"));
		sArr.add(new Student(86, 77, 54, "이몽룡"));
		sArr.add(new Student(68, 88, 79, "김영희"));
		
		Function<Student, Integer> sFun = (Student s) -> {
			return s.kor + s.eng + s.math;
		};
		
		Function<Student, Double> avgFun = (Student s) -> {
			return (s.kor + s.eng + s.math) / 3.0;
		};
		
		for(Student student : sArr) {
			System.out.println("총점 : " + sFun.apply(student) + ", 평균 : " + avgFun.apply(student));
		}
		
		
		System.out.println();
		
		//Function<String, Integer> fun = (String s) -> {
		//	return s.length();
		//};
 		
		Function<String, Integer> fun = s -> s.length();
		
		System.out.println(fun.apply("안녕"));
		
	}
}
