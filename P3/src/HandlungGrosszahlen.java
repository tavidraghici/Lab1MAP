import java.util.Arrays;

public class HandlungGrosszahlen {
    public static int[] sum(int[] z1, int[] z2){
        int[] result = new int[z1.length];

        int carry = 0;
        for(int i = z1.length - 1; i >= 0; i--){
            int s = z1[i] + z2[i] + carry;

            result[i] = s%10;
            carry = s/10;
        }

        if(carry==1) {
            if(result[result.length - 1] != 0 )
                result = Arrays.copyOf(result, result.length+1);
            System.arraycopy(result, 0, result, 1, result.length - 1);
            result[0] = carry;
        }

        return result;
    }

    public static int[] dif(int[] z1, int[] z2) {
        int[] result = new int[z1.length];

        int carry = 0;
        for (int i = z1.length - 1; i >= 0; i--) {
            int d = z1[i] - z2[i] - carry;

            if (d < 0) {
                result[i] = 10 + d;
                carry = 1;
            } else {
                result[i] = d;
                carry = 0;
            }
        }

        //if first values are 0, shift must be done
        int count_0 = 0;
        for (int j : result) {
            if (j == 0)
                count_0++;
            else
                break;
        }

        if(count_0 > 0)
            System.arraycopy(result, count_0, result, 0, result.length - count_0);

        return result;
    }

    public static int[] mul( int[] z, int ziff){
        int[] result = new int[z.length];
        int carry = 0;
        for(int i = z.length-1; i >= 0; i--){
            int p = z[i] * ziff + carry;

            result[i] = p % 10;
            carry = p / 10;
        }

        if(carry > 0){
            if(result[result.length - 1] != 0)
                result = Arrays.copyOf(result, result.length + 1);

            System.arraycopy(result, 0, result, 1, result.length - 1);
            result[0] = carry;
        }

        return result;
    }

    public static int[] div(int[] z, int ziff){
        if(ziff == 0)
            throw new ArithmeticException("Can't divide by 0");

        int[] result = new int[z.length];
        int d = 0;
        for(int i = 0, j = 0; i<z.length; i++) {
            d = (d*10) + z[i];
            if(d >= ziff)
                result[j] = d/ziff;
            else
                continue;

            d = d - (result[j++] * ziff);
        }
        return result;
    }

    public static void write(int[] z){
        for (int j : z) System.out.println(j);
    }
}
