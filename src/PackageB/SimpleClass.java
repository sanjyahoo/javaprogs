package PackageB;

public class SimpleClass {

    public static int i=0;

    SimpleClass(){
        i++;
    }


    public static void main(String[] args) {
        SimpleClass ob = new SimpleClass();
        SimpleClass ob1 = new SimpleClass();
        System.out.println(SimpleClass.i);
    }
}
