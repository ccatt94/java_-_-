
interface Add{
	int add(int num1, int num2);
}

interface Div{
	double div(double num3, double num4);
}

//람다란? 인터페이스 구현을 화살표 함수로
public class LamdaMain2 {

	public static void main(String[] args) {
		
		Printable prn = (s) -> System.out.println(s);
		prn.print("람다 완성");
		
		Add add = (int num1, int num2) -> {
			return num1 + num2;
		};
		
		//Add add = (num1, num2) -> num1 + num2;
		
		int hap = add.add(5, 6);
		System.out.println(add.add(20,30));
		
		Div div = (num1, num2) -> num1 / num2;
		System.out.println(div.div(50, 3));
	}
}
