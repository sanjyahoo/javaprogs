package PackageB;

public class SampleClass3 {
    int i=0;
    static int k=70;

    void hello(){
        System.out.println(this.i);
        System.out.println(this.k);
    }

    public static void main(String[] args) {
        SampleClass3 ob = new SampleClass3();
        System.out.println(ob.i);
    }
}
