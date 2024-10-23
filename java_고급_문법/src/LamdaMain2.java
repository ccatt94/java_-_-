import java.util.Set;
import java.util.TreeSet;

@FunctionalInterface // 인터페이스 안에 익명함수가 1개만 존재하는지 확인해주는 어노테이션(2개 이상일 경우 에러 발생)
interface Add{
	int add(int num1, int num2);
}

interface Div{
	double div(double num3, double num4);
}

interface Calculate{
	int cal(int num1, int num2);
}

interface Generator{
	Set<Integer> ranLotto();
	
}

//람다란? 인터페이스(이때 인터페이스 안에 반드시 익명 함수 한개만 있어야함) 구현을 화살표 함수로
public class LamdaMain2 {

	public static void main(String[] args) {

		Generator lotto = () -> {
			
			Set<Integer> lottoSet = new TreeSet<>();
			final int LOTTO = 6;
			
			while(lottoSet.size() < LOTTO) {
				int num = (int) ((Math.random() * 45) + 1);
				lottoSet.add(num);
			}
			
			
			return lottoSet;
			
		};
		
		System.out.println(lotto.ranLotto());
		
		
		
		
//		=============================================
		
		Calculate c;
		
		c = (a,b) -> a + b;
		
		System.out.println(c.cal(1, 20));
		
//		=============================================
		
		Printable prn = (s) -> System.out.println(s);
		prn.print("람다 완성");
		
		
//		=============================================
		
		Add add = (int num1, int num2) -> {
			return num1 + num2;
		};
		
		//Add add = (num1, num2) -> num1 + num2;
		
		int hap = add.add(5, 6);
		System.out.println(add.add(20,30));
		
//		=============================================

		Div div = (num1, num2) -> num1 / num2;
		System.out.println(div.div(50, 3));
	}
}
