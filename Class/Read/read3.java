package Class.Read;

public class read3 {
    static int A;

    static int Add(int C) {
        A = A + C;
        return A;
    }

    public static void main(String[] args) {
        Add(1);
        System.out.printf("\t%d", Add(2));
        Add(3);
        System.out.printf("\t%d", Add(4));
        Add(5);
        System.out.printf("\t%d", Add(6));
        Add(7);
        System.out.printf("\t%d", Add(8));
    }
}
