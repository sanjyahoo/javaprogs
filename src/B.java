public class B extends A{

    public void hello(){
        System.out.println("Hello class B");
    }

    static void yo(){
        System.out.println("static B");
    }
    public static void main(String[] args) {
        A ob = new A();
        ob.hello();
        yo();
    }
}
