import java.util.Arrays;

public class isPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(
                isPowerOfTwo(0)
        );
    }

    public static boolean isPowerOfTwo(int value) {
        return (Math.abs(value) == 1) || (Integer.bitCount(Math.abs(value)) == 1);
    }
}
