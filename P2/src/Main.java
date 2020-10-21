import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> zahlen= new ArrayList<Integer>();
        zahlen.add(4);
        zahlen.add(8);
        zahlen.add(3);
        zahlen.add(10);
        zahlen.add(17);

        HandlungArray h1 = new HandlungArray(zahlen);
        System.out.println(h1.maxZahl());
        System.out.println(h1.minZahl());
        System.out.println(h1.maxSumm());
        System.out.println(h1.minSumm());

    }
}
