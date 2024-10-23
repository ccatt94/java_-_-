
interface Printable{
	void print(String s);
}

class Printer implements Printable{
	
	@Override
	public void print(String s) {
		System.out.println(s);
	}
}

public class LamdaMain {

	public static void main(String[] args) {
//		Printable prn = new Printer();
//		prn.print("HI");
		
		Printable prn = new Printable() {
			
			@Override
			public void print(String s) {
				System.out.println(s);
				
			}
		};
		
		prn.print("람다 등장 안해씀");
	}

}
