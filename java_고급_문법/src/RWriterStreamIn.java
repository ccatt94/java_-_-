import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class RWriterStreamIn {

	public static void main(String[] args) {

		try (Writer out = new FileWriter("data.txt")) {
			out.write('A');
			out.write('한');
		} catch (Exception e) {
			e.printStackTrace();
		}

		try (Reader in = new FileReader("data.txt")) {

			int ch;

			while (true) {
				
				ch = in.read(); // 문자를 하나씩 읽음 - 2byte 단위
				
				if (ch == -1) // 더이상 읽을 문자가 없다면, 읽지 않음
					break;
				
				System.out.println((char) ch); // 문자를 하나씩 출력

			}

		} catch (Exception e) {

		}

	}
}
