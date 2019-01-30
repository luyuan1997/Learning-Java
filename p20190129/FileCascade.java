package p20190129;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCascade {
	public static void main(String[] args) {
		try {
			cascade(args);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private static void cascade(String... fileName) throws IOException {
		String str;
		BufferedWriter write = new BufferedWriter(new FileWriter("F:/ptest2.txt"));
		for(String name : fileName) {
			BufferedReader reader = new BufferedReader(new FileReader(name));
			
			while((str = reader.readLine()) != null) {
				write.write(str);
				write.newLine();
			}
		}
	}
}
