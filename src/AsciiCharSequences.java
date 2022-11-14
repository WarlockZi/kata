import java.util.Arrays;
import java.util.StringJoiner;

public class AsciiCharSequences {
    public static void main(String[] args) {
        byte[] c = {65, 66, 67, 68, 69, 70, 71};
        AsciiCharSequence a = new AsciiCharSequence(c);
        System.out.println(a.subSequence(1, 5).toString());
        System.out.println(a.charAt(15));
    }

public static class AsciiCharSequence implements CharSequence {
    byte[] b;

    public AsciiCharSequence(byte[] b) {
        this.b = b;
    }

    @Override
    public int length() {
        return this.b.length;
    }

    @Override
    public char charAt(int index) {
        if (index < 0 || index >= this.b.length) {
            throw new StringIndexOutOfBoundsException("index " + index +
                    ", length " + this.b.length);
        }
        return (char) b[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (end < 0 || end >= this.b.length) {
            throw new StringIndexOutOfBoundsException("index " + end +
                    ", length " + this.b.length);
        }
        byte[] a = new byte[end - start];
        int j = 0;
        for (int i = start; i < end; i++) {
            a[j] = this.b[i];
            j++;
        }
        this.b = a;
        return this;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= this.b.length - 1; i++) {
            char ch = this.charAt(i);
            String str = String.valueOf(ch);
            sb.append(str);
        }
        return sb.toString();
    }
}
}

