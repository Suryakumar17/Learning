package nintydays.day2;

public class Find_lc_uc_number_3rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentences="1.It is Work from Home not Work for Home";
		int upper = 0, lower = 0, number = 0, spaces = 0; 
		String uppercase_pattern="[^A-Z]";
		String lowercase_pattern="[^a-z]";
		String number_pattern="[^0-9]";
		String spce="\\S";
		 upper = sentences.replaceAll(uppercase_pattern, "").length();
		 lower=sentences.replaceAll(lowercase_pattern, "").length();
		 number=sentences.replaceAll(number_pattern, "").length();
		 spaces=sentences.replaceAll(spce, "").length();
		 System.out.println("Uppercase:"+upper);
	        System.out.println("Lowercase:"+lower);
	        System.out.println("Numbers:"+number);
	        System.out.println("special:"+spaces);
	}

}
