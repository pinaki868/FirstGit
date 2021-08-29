package Programs;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacters {

    public static void main(String args[]){

        String str = "Kolkata";
        Map<Character,Integer> map = new HashMap();
        char[] arr = str.toLowerCase().toCharArray();
        for (char c: arr
             ) {
          if (!map.containsKey(c)){
              map.put(c,1);
          }
          else{
              map.put(c,map.get(c)+1);
          }
        }

        for (Map.Entry e:map.entrySet()){
            System.out.println(e.getKey()+" "+" "+e.getValue());
        }


    }

}
