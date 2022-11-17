class testexps {
    public static void main(String[] args) throws MyNewException {
        testExp();
    }

    public static void testExp() throws MyNewException {
        throw new MyNewException("juj");

    }
}

class MyNewException extends Exception {
    public MyNewException(String message) {
        super(message);
    }
}


