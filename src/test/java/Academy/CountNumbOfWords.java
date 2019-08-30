package Academy;

import java.util.HashMap;
import java.util.Map;

public class CountNumbOfWords {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * int count = 0; String str = "Automation using selenium";
	 * 
	 * for (int i = 0; i <= str.length() - 1; i++) { if (str.charAt(i) != ' ') {
	 * count = count + 1; } } System.out.println(count); }
	 */
	
	public class Main {
		  public void main(String args[])
		   {
		      
		      String s = "this is a test this is a test";
		      String[] splitted = s.split(" ");
		      Map<String, Integer> hm = new HashMap<String, Integer>();

		      for (int i=0; i<splitted.length ; i++) {
		         if (hm.containsKey(splitted[i])) {
		            int cont = hm.get(splitted[i]);
		            hm.put(splitted[i], cont + 1);
		         } else {
		            hm.put(splitted[i], 1);
		         }
		      }
		      System.out.println(hm);
		   }
		}
}
