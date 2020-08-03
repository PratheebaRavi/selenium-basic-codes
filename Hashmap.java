package intro;

import java.util.HashMap;

public class Hashmap {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "This this is is done by Saket Saket";
        String[] split = str.split(" ");
        System.out.println(split);
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for (int i=0; i<split.length-1; i++) {
        	  System.out.println(i);
            if (map.containsKey(split[i])) {
            	  System.out.println(map);
                int count = map.get(split[i]);
                System.out.println(count);
                map.put(split[i], count+1);
                System.out.println(map);
            }
            else {
                map.put(split[i], 1);
                System.out.println(map);
            }
        }
        System.out.println(map);
    }
 
}