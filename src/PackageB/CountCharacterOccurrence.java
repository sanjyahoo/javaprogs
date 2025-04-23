package PackageB;

public class CountCharacterOccurrence {

    public static int countChat(String s){
        int count = s.length()-s.replaceAll("a","").length();
        System.out.println(count);
        return  count;
    }

    public static void main(String[] args) {
        countChat("sanjay is working");
    }
}
