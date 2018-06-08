package chapter7.chapter7_5;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] msgs= {
			"Java has regular expressions in 1.4",
			"regular expressions now expressing in Java",
			"Java represses oracular expressions"
		};
		for(String msg : msgs) {
			System.out.println(msg.replaceFirst("re\\w*", "¹þ¹þ£º£©"));
			System.out.println(Arrays.toString(msg.split(" ")));
		}
	}

}
