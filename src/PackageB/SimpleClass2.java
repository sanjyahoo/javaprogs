package PackageB;

public class SimpleClass2 {

    public int i=0;

    SimpleClass2(){
        i++;
    }


    public static void main(String[] args) {
        SimpleClass2 ob = new SimpleClass2();
        SimpleClass2 ob1 = new SimpleClass2();
        System.out.println(ob.i);
        System.out.println(ob1.i);
    }
}
