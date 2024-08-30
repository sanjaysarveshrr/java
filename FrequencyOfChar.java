package Practice;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str="sanjaysarvesh";
        Map<Character,Integer> fre=new HashMap<>();
        for(char c: str.toCharArray())
        {
            if(fre.containsValue(c)){
                fre.put(c,fre.get(c)+1);
            }
            else {
                fre.put(c,1);
            }
        }
        for(char c:fre.keySet()){
            System.out.println(c + " " + fre.get(c));
        }
    }
}
