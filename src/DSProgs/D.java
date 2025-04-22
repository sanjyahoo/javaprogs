package DSProgs;

public class D {

    int age=30;
    D(int age){
        System.out.println(age);
        this.age=age;
    }

    D(){
        this(20);
    }

    void hello(){
        System.out.println(age);
    }

    public static void main(String[] args) {
        new D(20).hello();
    }
}
