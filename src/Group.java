import java.util.Arrays;

public class Group {
    public static void main(String[] args) {
        System.out.println(mergeArrays(new int[]{1, 3, 5}, new int[]{1, 2, 2, 4}));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] res = new int[a1.length + a2.length];
        int a = 0, b = 0, r = 0;
        int c = Math.min(a1.length, a2.length);
        for (int i = 0; i <= c; i++) {
            if (a1[i] < a2[i]) {
                res[r] = a1[i];
            } else if (a1[i]>a2[i]) {
                res[r] = a2[i];
            }else{
                res[r] = a2[i];
            }
            r++;
        }

        if (a < a1.length) {
            int[] a1a2 = Arrays.copyOf(a2, a1.length + a2.length);
            for (int i = a1.length; i < a1a2.length; i++) {
                res[i] = a2[i - a1.length];
            }
        } else {
            int[] a1a2 = Arrays.copyOf(a1, a1.length + a2.length);
            for (int i = a2.length; i < a1a2.length; i++) {
                res[i] = a2[i - a1.length];
            }
            System.arraycopy(a2, b, res, r, (a2.length - b));
        }
        return res;
    }
}
