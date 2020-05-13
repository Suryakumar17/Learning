package nintydays.day1;

public class Occurence {
public static void main(String[] args) {
	String sentences="You have no choice other than following me!";
	char[] character=sentences.toCharArray();
	System.out.println(character.length);
	int count=0;
	for(int i=0;i<character.length;i++) {
		if(character[i]=='o' || character[i]=='O') {
			count=count+1;
		}
		
	}
	System.out.println("Occurance of o is:"+count);
}
}
