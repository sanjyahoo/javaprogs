package DSProgs;

import java.util.HashMap;
import java.util.Map;

public class DupeString {

    static void printDupes(String s){
        char[] characters = s.toCharArray();
        Map<Character, Integer > map = new HashMap();
        for(Character ch: characters){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            } else {
                map.put(ch,1);
            }
        }
    }

    public static void main(String[] args) {
        printDupes("sanjay");
    }
}
