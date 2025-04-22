package DSProgs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class integerOccurence {
    static void checkCount(long num){

        Map<Long,Integer> map = new HashMap<>();
        while(num!=0) {
            long x = num%10;
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            } num=num/10;
        }

        Set<Long> keys = map.keySet();
        for(Long key:keys){
            System.out.println(key+" --> "+map.get(key));
        }
    }

    public static void main(String[] args) {
        checkCount(12432);
    }
}
