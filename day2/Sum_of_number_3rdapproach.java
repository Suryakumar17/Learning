package nintydays.day2;

public class Sum_of_number_3rdapproach {

	public static void main(String[] args) {
		String sample="asdf1qwer9as8d7";
		
		int sum=0;
		for(int i=0;i<sample.length();i++) {
			char charAt = sample.charAt(i);
			if(Character.isDigit(charAt))
			sum=sum+Integer.parseInt(String.valueOf(charAt));
		}
		System.out.println(sum);

			}

		}
