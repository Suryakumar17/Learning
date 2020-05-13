package nintydays.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sample1="malayalam";

String reverse="";
char[] character=sample1.toCharArray();
	for(int i=character.length-1;i>=0;i--) {
		reverse=reverse+character[i];
	}
	System.out.println(reverse);
	
	if(reverse.equalsIgnoreCase(sample1)) {
		System.out.println("yes palindrome");
	}
	else {
		System.out.println("Not palindrome");
	}
	}
}
