package DSProgs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class C {
   static void reoccur(String s){
       Map<Character,Integer> hash = new HashMap();
       for(int i=0;i<s.length();i++){
           if(hash.containsKey(s.charAt(i))){
               hash.put(s.charAt(i),hash.get(s.charAt(i))+1);
           } else {
               hash.put(s.charAt(i),1);
           }
       }

       Iterator it = hash.entrySet().iterator();
       while (it.hasNext()){
          Map.Entry obj = (Map.Entry)it.next();
          System.out.println(obj.getKey()+" = "+obj.getValue());
       }

    }

    public static void main(String[] args) {
        reoccur("lalaland");
    }
}
