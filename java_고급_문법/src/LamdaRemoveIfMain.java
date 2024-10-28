import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LamdaRemoveIfMain {

	public static void main(String[] args) {
		
		List<Student> sArr = new ArrayList<Student>();
		sArr.add(new Student(90, 80, 70, "홍길동"));
		sArr.add(new Student(86, 77, 54, "이몽룡"));
		sArr.add(new Student(68, 88, 79, "김영희"));     
		sArr.add(new Student(66, 55, 43, "박철수"));     
     
		//1. 수학점수 70점 미만인 학생 제거
		//boolean test(T t);
		Predicate<Student> pStudent = (Student student) -> {
			int math = student.math;
			return (math < 70) ? true : false;
		};
		
		for(Student student2 : sArr) {
			System.out.println(student2.name);
		}
		
		System.out.println("================================================");
		
		//2. 평균이 70점 미만인 학생 제거
		pStudent = (Student student) -> {
			
			double avg = (student.kor + student.eng + student.math) / 3.0;
			return (avg < 70) ? true : false;
		};
		
		sArr.removeIf(pStudent);
		
		for(Student student3 : sArr) {
			System.out.println(student3.name);
		}
		
		System.out.println("================================================");

		List<Integer> ls = Arrays.asList(1, -2, 3, 4, 5);
		ls = new ArrayList<>(ls);
		
		Predicate<Number> p = n -> n.doubleValue() < 0.0; //삭제조건

		//boolean test(T t)
		Predicate<Integer> p1 = (Integer i) -> {
			return (i<0) ? true : false;
		};
		
		
		ls.removeIf(p1);
		System.out.println(ls);
		
		ls.removeIf(p);
		System.out.println(ls);
		
	}
	
}
