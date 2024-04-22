package carsclasses;

public class Main {

    public static void main(String[] args) {
        Car mazdaCx5 = new CombustionCar("Mazda", 120, 2200, CarType.SUV);
        Car bmwm3 = new CombustionCar("BMW M3", 220, 1800, CarType.COUPE);
        Car tesla = new ElectricCar("Tesla", 250, 2000, CarType.SEDAN);

        testTheCar(mazdaCx5);
        testTheCar(bmwm3);
        testTheCar(tesla);

        ElectricCar teslaModel3 = new ElectricCar("Tesla", 250, 2000, CarType.SEDAN);
        teslaModel3.drive();

    }

    public static void testTheCar(Car car){
        System.out.println("--------------");
        describeCar(car);
        driveCar(car);
        System.out.println("--------------");

    }

    public static void describeCar(Car car){
        System.out.println("Name: " + car.getName() + "\n" +
                "Type: " + car.getCarType() + "\n" +
                "HP: " + car.getHp() + "\n" +
                "Weight: " + car.getWeight());
    }

    public static void driveCar(Drivable driveable){
        driveable.drive();
    }
}
