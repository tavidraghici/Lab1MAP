import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    int[] z1 = new int[]{1, 9, 0, 0, 0, 0, 0, 0, 0};
    int[] z2 = new int[]{8, 3, 0, 0, 0, 0, 0, 0, 0};

    HandlungGrosszahlen h1 = new HandlungGrosszahlen();

    h1.write(h1.sum(z1, z2));
    h1.write(h1.mul(z1, 9));
    }
}