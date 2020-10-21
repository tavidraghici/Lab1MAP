import java.util.ArrayList;
import java.util.List;

public class HandlungArray {
    List<Integer> zahlen = new ArrayList<Integer>();

    public HandlungArray(List<Integer> zahlen) {
        this.zahlen = zahlen;
    }

    public int maxZahl(){
        int maxZ = zahlen.get(0);
        for(int n : zahlen){
            if(maxZ < n)
                maxZ = n;
        }
        return maxZ;
    }

    public int minZahl(){
        int minZ = zahlen.get(0);
        for(int n : zahlen){
            if(minZ > n)
                minZ = n;
        }
        return minZ;
    }

    public int maxSumm(){
        int minZ = minZahl();
        int sum = 0;
        for(int n : zahlen){
            sum += n;
        }
        return sum-minZ;
    }

    public int minSumm(){
        int maxZ = maxZahl();
        int sum = 0;
        for(int n : zahlen){
            sum += n;
        }
        return sum-maxZ;
    }
}
