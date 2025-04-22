import java.util.Arrays;
import java.util.Vector;

public class Tattu {
    public static void main(String[] args) {
        Vector vc = new Vector<>(Arrays.asList(1,2,3,"sanjay",0.99));
        Object y;
        int i = 1;
        Integer x = 2;
        String s="sanjay";

        vc.add(i);
        vc.add(x);
        vc.add(s);

        System.out.print(vc);

        Object arr[] = {1,2,3,"san"};

    }
}
