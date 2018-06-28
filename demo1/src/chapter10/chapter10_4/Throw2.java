package chapter10.chapter10_4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Throw2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try {
			new FileOutputStream("a.txt");
		}
		catch(Exception ex){
			ex.printStackTrace();
			throw ex;
		}
	}
}
