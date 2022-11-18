class getCallerClass {

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] e = new Throwable().getStackTrace();
        if (e.length > 2) {
            return e[2].getClassName() + "#" + e[2].getMethodName();
        }
        return null;
    }
}


