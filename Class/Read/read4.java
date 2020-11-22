package Class.Read;

public class read4 {
    public static void main(String[] args) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int i = 90, k = 1;
        while (k++ <= 5)
            out.write(i--);
        ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
        int n = -1;
        while ((n = in.read()) != -1) {
            System.out.printf("\t%c", (char) n);
        }
    }

}
