package string.programs;

public class FindSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "ABC";
		int len = s.length();
		int temp = 0;
		String[] str = new String[(len*(len+1))/2]; 
		
		for(int i=0; i<len ; i++) {
			for(int j=i; j<len; j++) {
				str[temp] = s.substring(i, j+1);
				temp++;
			}
		}
		
		for(String ss : str) {
			System.out.println(ss);
		}
	}

}
