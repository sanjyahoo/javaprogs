package PackageB;

import java.util.HashSet;
import java.util.Set;

public class VowelCount {

    //Count the number of vowels (a, e, i, o, u) in a given string.

    public static int vowelCount(String s){
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int vowelCount=0;

        for(int i=0;i<s.length();i++){
            if(vowels.contains(s.charAt(i))){
                vowelCount++;
            }
        }
        System.out.println(vowelCount);
        return vowelCount;
    }

    public static void main(String[] args) {
        vowelCount("snajay sharma");
    }
}
