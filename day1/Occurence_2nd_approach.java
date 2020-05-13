package nintydays.day1;


import java.util.LinkedHashMap;
import java.util.Map;

public class Occurence_2nd_approach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentences="You have no choice other than following me!";
		
		char ch;
		Map<Character,Integer> st=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<sentences.length();i++) {
		
			ch=sentences.charAt(i);
			int count=0;
			for(int j=0;j<sentences.length();j++ ) {
				if(sentences.charAt(j)==ch) {
					count=count+1;
					
					
				}
				st.put(ch, count);
				
				
			}
			
		}
		System.out.println(st.get('o'));
			}

		}
