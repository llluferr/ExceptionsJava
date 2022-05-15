
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestException2 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("c:\\nota.txt");
		
		PrintWriter print = new PrintWriter(fw);
		print.print("Maca = R$ 4,00");
		print.print("Morango = R$ 6,50");
		print.print("Total = R$ 10,50");
		print.close();
		fw.close();
	}
	
}
