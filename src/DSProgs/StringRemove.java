package DSProgs;

public class StringRemove {
    public static void main(String[] args) {
        String str = "A^%$^&n in&*terv!@#$%^&*iew with Scik*&^%^$%ey";

        String s2 = str.replaceAll("[^0-9A-Z a-z]","");
        System.out.println(s2);
    }
}

// SoftAssertion assert = new SoftAssertion();
//assert.asserTrue(gfkgkjg);
//vj
//bn.class
//assert.verfyAll();