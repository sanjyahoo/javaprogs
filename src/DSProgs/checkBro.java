package DSProgs;

public class checkBro {

    static int num;

      static{
          num=98;
          System.out.println("static block 1");
      }

    static{

        System.out.println("static block 2");
    }

    static{

        System.out.println("static block 3");
    }

    public static void main(String[] args) {
        System.out.println(num);
    }
}
