package p20190128;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStream {
	public static void main(String[] args) {
		ObjectOutputStream objectwriter = null;
		ObjectInputStream objectreader = null;
		try {
			objectwriter = new ObjectOutputStream(new FileOutputStream("F:/fileTest.doc"));
			objectwriter.writeObject(new Student("gg", 22));
			objectwriter.writeObject(new Student("tt", 28));
			objectwriter.writeObject(new Student("rr", 29));
			objectreader = new ObjectInputStream(new FileInputStream("F:/fileTest.doc"));
			for(int i = 0; i < 3; i++) {
				System.out.println(objectreader.readObject());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				objectreader.close();
				objectwriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
