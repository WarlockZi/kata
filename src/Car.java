public class Cars {
    public static void main(String[] args) {
        try {
            Car car = new Car();
            Car.drive();
        } catch (Exception ignore) {

        }
    }
    public static class Car {
        public static void drive() {
            System.out.println("Машина поехала");
        }

        public void close() {
            System.out.println("Машина закрывается");
        }
    }
}



