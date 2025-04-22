package DSProgs;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class maxCharOccur {
    static void findMax(String x){
        Map<Character,Integer> map = new HashMap<>();
        for(Character chars: x.toCharArray()){
            if(map.containsKey(chars)){
               map.put(chars,map.get(chars)+1);
            } else{
                map.put(chars,1);
            }
        }

        int maxValue = Collections.max(map.values());

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue()==(maxValue)) {
                System.out.println(entry.getKey() + " : "+entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        findMax("Java");
    }
}
