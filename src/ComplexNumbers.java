import java.util.Objects;

public class ComplexNumbers {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(190.0, 133.2);
        ComplexNumber b = new ComplexNumber(133.2, 190.0);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }

    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber() {
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            ComplexNumber cn = (ComplexNumber) o;
            return Double.compare(cn.re, re) == 0 && Double.compare(cn.im, im) == 0;
        }

        @Override
        public int hashCode() {
            int res = (int) Double.hashCode(re);
            return res + 31 * (int) Double.hashCode(im);
        }
    }

}

