import javax.swing.*;
import java.util.List;

public class HandlungPreis {
    public int billig(int[] Tastatur) {
        int min = Integer.MAX_VALUE;
        for (int i : Tastatur) {
            if (min > i)
                min = i;
        }
        return min;
    }

    public int teuerste(int[] Tastatur, int[] USB) {
        int max = 0;
        for (int i : Tastatur) {
            if (max < i)
                max = i;
        }
        for (int i : USB) {
            if (max < i)
                max = i;
        }
        return max;
    }

    public int teuersteBuget(int[] USB, int buget) {
        int max = -1;
        for (int i : USB) {
            if (max < i && i <= buget)
                max = i;
        }
        return max;
    }

    public int ComandaBuget(int[] USB, int[] Tastatur, int buget) {
        int aux = 0, max = 0;
        for (int i : Tastatur)
            for (int j : USB) {
                aux = i + j;
                if (aux > max && aux <= buget)
                    max = aux;
            }
        if(max==0)
            return -1;
        return max;
    }
}
