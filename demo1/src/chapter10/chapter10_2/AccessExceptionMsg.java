package chapter10.chapter10_2;

import java.io.FileInputStream;
import java.io.IOException;

public class AccessExceptionMsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		}
		catch(IOException ioe){
			System.out.println(ioe.getMessage());
			ioe.printStackTrace();
		}
	}

}
