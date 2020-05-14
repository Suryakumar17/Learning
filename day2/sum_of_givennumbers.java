package nintydays.day2;


public class sum_of_givennumbers {

	public static void main(String[] args) {
		
String sample="asdf1qwer9as8d7";
String pattern="\\D";
String replaceAll = sample.replaceAll(pattern, "");
System.out.println(replaceAll);
int sum=0;
for(int i=0;i<replaceAll.length();i++) {
	char charAt = replaceAll.charAt(i);
	sum=sum+Integer.parseInt(String.valueOf(charAt));
}
System.out.println(sum);

	}

}
