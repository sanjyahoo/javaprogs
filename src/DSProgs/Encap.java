package DSProgs;

public class Encap {

    private int i=10;
    private int x;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void printI(){
        System.out.println(i);
    }

    private int hello(){
        x = i+i;
        return x;
    }

    public void getHelloCal(){
        hello();
    }
}
