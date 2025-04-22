package PackageB;

public class Class2 extends Class1{

    int i=40;
    static int k=110;

    void callI(){
        System.out.println(i);
    }

    void callK(){
        System.out.println(k);
    }

    public static void main(String[] args) {
        Class1 ob = new Class2();
        ob.callI();
        ob.callK();
    }
}
