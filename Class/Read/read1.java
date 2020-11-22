package Class.Read;

public class read1 {
    public static void main(String[] args) {
        String s0 = "Core Java is nice.";
        String s1 = new String(s0);
        String s2 = new String(s0);
        String s3 = "Core Java is nice.";
        String s4 = "Core Java is nice.";
        System.out.printf("\t%b", s0 == s1);
        System.out.printf("\t%b", s1 == s2);
        System.out.printf("\t%b", s1.equals(s2));
        System.out.printf("\t%b", s3 == s4);
        System.out.printf("\t%b", s3.equals(s4));
    }
}
