package chapter7.chapter7_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] msgs= {
			"Java has regular expressions in 1.4",
			"regular expressions now expressing in Java",
			"Java represses oracular expressions"
		};
		Pattern p = Pattern.compile("re\\w*");
		Matcher matcher = null;
		for(int i =0; i<msgs.length;i++) {
			if(matcher == null) {
				matcher = p.matcher(msgs[i]);
			} else {
				matcher.reset(msgs[i]);
			}
			System.out.println(matcher.replaceAll("¹þ¹þ:)"));
		}
	}

}
