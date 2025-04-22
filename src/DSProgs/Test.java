package DSProgs;

public class Test {

    static void revString(String s){

        String s1 = "";
        String s2[] = s.split(" ");
        String s3 = "";

        for(int i =0;i<s2.length;i++){
            for(int k=s2[i].length()-1;k>=0;k--){
                s1 = s1 + s2[i].charAt(k);
            }
            s1=s1+" ";
        }

        System.out.print(s1);
    }
    public static void main(String[] args) {
        revString("My name is sanjay");
    }
}
