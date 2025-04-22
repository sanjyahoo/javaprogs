package DSProgs;

 class Encap2 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("a");
        sb.append("Test");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
