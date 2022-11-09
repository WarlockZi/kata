import static java.lang.String.checkIndex;

public class AsciiCharSequences {
    public static void main(String[] args) {

    }

    public static class AsciiCharSequence {
        public AsciiCharSequence(byte[] b) {
            for (int i = 0; i < ; i++) {
                CharSequence.compare();

            }
        }
        public int length() {
            return count;
        }

        public char charAt(int index) {
            checkIndex(index, count);
            if (isLatin1()) {
                return (char)(value[index] & 0xff);
            }
            return StringUTF16.charAt(value, index);
        }
        @Override
        public CharSequence subSequence(int start, int end) {
            return substring(start, end);
        }

        public String toString() {
            return toString(position(), limit());
        }

    }

}

