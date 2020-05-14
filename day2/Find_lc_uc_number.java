package nintydays.day2;

public class Find_lc_uc_number {

	public static void main(String[] args) {
		String sentences="1.It is Work from Home not Work for Home";
		int upper = 0, lower = 0, number = 0, spaces = 0; 
		  
        for(int i = 0; i < sentences.length(); i++) 
        { 
            char ch = sentences.charAt(i); 
            if (ch >= 'A' && ch <= 'Z') 
                upper++; 
            else if (ch >= 'a' && ch <= 'z') 
                lower++; 
            else if (ch >= '0' && ch <= '9') 
                number++; 
            else
                spaces++; 
        } 
        System.out.println("Uppercase:"+upper);
        System.out.println("Lowercase:"+lower);
        System.out.println("Numbers:"+number);
        System.out.println("special:"+spaces);
	}

}
