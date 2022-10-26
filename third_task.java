import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.LinkedList;

public class third_task {
    public static void main(String args[]) {

        ArrayList arrayList = new ArrayList();
        var random = new SecureRandom();
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }
        long Time1 = System.currentTimeMillis();
        for (int i = 0; i<100000; i++) {
            var  n = arrayList.get(random.nextInt(arrayList.size()));
        }
        long Time2 = System.currentTimeMillis();
        for (int i = 0; i<100000; i++) {
            var  m = linkedList.get(random.nextInt(linkedList.size()));
        }
        long Time3 = System.currentTimeMillis();
        long timeofarray = Time2;
        long timeoflist = Time3-Time1;
        System.out.println(timeofarray);
        System.out.println(timeoflist);
    }

}


