package nintydays.day2;

public class Find_lc_uc_number_2ndapproach {

	public static void main(String[] args) {
		String sentences="1.It is Work from Home not Work for Home";
		int upper = 0, lower = 0, number = 0, spaces = 0; 
		for(int i=0;i<sentences.length();i++) {
			char ch=sentences.charAt(i);
			if(Character.isLowerCase(ch)) {
				lower++;
			}
			else if(Character.isUpperCase(ch)) {
				upper++;
			}else if(Character.isDigit(ch)) {
				number++;
			}else if(Character.isWhitespace(ch)) {
				spaces++;
			}
		}
		 System.out.println("Uppercase:"+upper);
	        System.out.println("Lowercase:"+lower);
	        System.out.println("Numbers:"+number);
	        System.out.println("special:"+spaces);
	}

}
