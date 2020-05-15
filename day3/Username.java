package nintydays.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Username {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input="Test";
String pattern="[a-zA-Z0-9._@$]{8,}";

Pattern compile = Pattern.compile(pattern);
Matcher matcher = compile.matcher(input);
System.out.println(matcher.matches());
	}

}
