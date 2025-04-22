package DSProgs;

public class Child1 extends Parent{
    void hello(){
        System.out.println("Hello Child1");
    }

    static void hi(){
        System.out.println("Hello static child 1");
    }

//    final void no(){
//        System.out.println("Hello final parent");
//    }

    public static void main(String[] args) {
        Parent ob = new Child1();
        ob.hi();
    }
}
