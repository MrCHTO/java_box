package Class.Read;

public class read6 {
    public static void main(String[] args) {
        List<String> a = new LinkedList<String>();
        a.add("Argentina");
        a.add("Carmarone");
        a.add("Egypt");
        List<String> b = new LinkedList<String>();
        b.add("Brazil");
        b.add("Denmark");
        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();
        while (bIter.hasNext()) {
            if (aIter.hasNext())
                aIter.next();
            aIter.add(bIter.next());
        }
        System.out.println(a);
    }

}
