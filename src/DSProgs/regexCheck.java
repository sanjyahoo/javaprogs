package DSProgs;

public class regexCheck {
    public static void main(String[] args) {
        String s = "1&€000,000";
        String s1 = s.replaceAll("[^a-zA-Z0-9\\s]"," ");
        System.out.println(s1);
    }
}
