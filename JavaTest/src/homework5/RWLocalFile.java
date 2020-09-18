package homework5;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class RWLocalFile {
	
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\Administrator\\Desktop\\test.txt");
		File file2 = new File("D:\\git_space\\new_test.txt");
		Reader r = new FileReader(file);
		
		Writer w = new FileWriter(file2);
		int len = 0;
		while((len = r.read()) != -1) {
			w.write(len);
		}
		System.out.println("¸´ÖÆÍê³É£¡£¡£¡£¡£¡");
		r.close();
		w.close();
		
	}
}
