package project.budgetmanager;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		double count = 0;
		
		Scanner sc = new Scanner(System.in);
		List<String> sentence = new ArrayList<String>();
	

		while(sc.hasNextLine()) {
			System.out.print("");
			String s = sc.nextLine();
			sentence.add(s);
		}
		for(String s: sentence) {
			String str = s;
			//char[] charString = s.toCharArray();
			
			String stringInt = "" ;
			int findIndex = 	str.indexOf('$');
			for(int i=findIndex+1; i<str.length(); i++) {
				
				if(str.charAt(i) == '.' ||str.charAt(i) == '0' ||  str.charAt(i)=='1' ||  str.charAt(i)=='2' ||  str.charAt(i)=='3' ||  str.charAt(i)=='4' ||  str.charAt(i)=='5' ||  str.charAt(i)=='6'||  str.charAt(i)=='7'||  str.charAt(i)=='8'||  str.charAt(i)=='9') {
				stringInt = stringInt + str.charAt(i);
				}
			} 
			count = count +  Double.parseDouble(stringInt);
		}
		for(String s : sentence) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println("Total: $"+count);
	}

}
