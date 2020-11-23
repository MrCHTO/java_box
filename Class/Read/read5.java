package Class.Read;

import java.io.*;

public class read5 {
    public static void main(String[] args) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        for (int i = 90; i <= 82; i = i - 2) {
            out.write(i);
        }
        ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
        int n = -1;
        while ((n = in.read()) != -1) {
            System.out.printf("\t%c", (char) n);
        }
    }

}
