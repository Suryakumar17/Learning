package nintydays.day2;


public class sum_of_numbers_2nd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sample="asdf1qwer9as8d7";
		
		int num=0;
		for(int i=0;i<sample.length();i++) {
			char ch=sample.charAt(i);
			if(!((ch>='a') && (ch<='z'))) {
				
				num+=Integer.parseInt(String.valueOf(ch));
			}
			
		}System.out.println("sum of numbers in alphanumeric:"+num);
		
	}

}
