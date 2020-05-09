package powtorka;

public class Test {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "Corolla");
        Car car2 = new Car("BMW", "5");

        System.out.println(car.description());
        System.out.println(car2.description());
        System.out.println(car.getBrand());

        Car[] cars = new Car[2];
        cars[0] = car;
        cars[1] = car2;


        for (Car auto : cars) {
            System.out.println(auto.description());
        }


    }
}
