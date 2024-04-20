public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Car car = new Car();
        System.out.println(car.InfoCar());

        Car car2 = new Car("Różowy");
        System.out.println(car2.InfoCar());

        Car car3 = new Car("Czarny", 2024);
        System.out.println(car3.InfoCar());

    }
}