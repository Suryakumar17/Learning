package nintydays.day2;

public class Reverse_evenposition {

	public static void main(String[] args) {
		String sentences="When the world realize its own mistake, corona will dissolve automatically";
		String values="";
String[] split = sentences.split(" ");

for(int i=0;i<split.length;i++) {
	
if(i%2==0) {
	String string = split[i].toString();
	values+=string+" ";
}else {
	
	StringBuffer str=new StringBuffer(split[i]);
	StringBuffer reverse = str.reverse();
	String string = reverse.toString();
	values+=string+" ";
}
	
}System.out.println(values);
}

	}


