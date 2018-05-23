package regexMatches;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
	public static void main(String[] args) {
		String line = "This order was placed for QT3000! OK?";
		String pattern = "(.*)(\\d+)(.*)";
		Pattern r = Pattern.compile(pattern);
		
		Matcher m = r.matcher(line);
		if(m.find()) {
			
		}
	}
}
