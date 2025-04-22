package DSProgs;

public class ipCheck {
    static boolean checkIP(String ipAddress){
        boolean flag = true;
        String ar[] = ipAddress.split("\\.");
        System.out.print(ar.length);
        if(ar.length==4) {
            for (int i = 0; i < ar.length; i++) {
                if (Integer.parseInt(ar[i]) > 255 && Integer.parseInt(ar[i]) < 0) {
                    flag = false;
                    break;
                }
            }
        } else{
            flag=false;
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.print(checkIP("109.0.0.0"));
    }
}
