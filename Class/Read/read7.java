package Class.Read;
import java.util.*;
public class read7 {
    public static void main(String[ ] args){
        Set set=new TreeSet();
        set.add(new Integer(150));
        set.add(new Integer(200));
        set.add(new Integer(55));
        set.add(new Integer(400));
        System.out.print("size="+set.size()+" ");
        Iterator it=set.iterator();
        while(it.hasNext()){
        System.out.print(it.next()+" ");
        } 
        }

}
