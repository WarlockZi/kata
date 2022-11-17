class getCallerClass {

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        if (getCallerClassAndMethodName() < 3) {

        }
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        Exception e = new Exception();
        StackTraceElement st = e.getStackTrace();
    }
}


