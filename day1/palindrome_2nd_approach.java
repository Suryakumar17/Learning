package nintydays.day1;

public class palindrome_2nd_approach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sample1="testleaf";
StringBuffer str=new StringBuffer(sample1);
StringBuffer reverse = str.reverse();
String string = reverse.toString();
if(sample1.equals(string)) {
	System.out.println("palindrome");
}
else {
	System.out.println("Not palindrome");
}
	}
	}
