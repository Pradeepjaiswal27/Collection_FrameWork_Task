package Task;

import java.util.HashMap;
import java.util.Map;

public class Task4 {
	public static void modifyString(String s)
    {

	   Map<Character, Integer> d
       = new HashMap<Character, Integer>();

   for (int i = 0; i < s.length(); i++) {
       if (d.containsKey(s.charAt(i))) {
           d.put(s.charAt(i), d.get(s.charAt(i)) + 1);
       }
       else {
           d.put(s.charAt(i), 1);
       }
   }

   
   for (int i = 0; i < s.length(); i++) {

      
       if (d.get(s.charAt(i)) != 0) {
           System.out.print(s.charAt(i));
           System.out.print(d.get(s.charAt(i)) + " ");
           d.put(s.charAt(i), 0);
       }
   }
}


public static void main(String[] args)
{
   String S = "helloworld";
   modifyString(S);
}
}

