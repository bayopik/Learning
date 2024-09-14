public class FacturingCompany {


    public Car createCar(CarEnum type) {
        Car car;

        switch (type) {
            case KIA:
                car = new KiaCar("kia", new Car.Motor(), new Car.AutoTransmission());
                System.out.println("Car created: " + car.getName());
                break;
            case LAMBORGINI:
                car = new LamborginiCar("lamborgini", new Car.Motor(), new Car.AutoTransmission());
                System.out.println("Car created: " + car.getName());
                break;
            case VAZ:
                car = new VazCar("vaz", new Car.Motor(), new Car.AutoTransmission());
                System.out.println("Car created: " + car.getName());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
        return car;
    }

    public Car createCar(String type) {
        Car car;
        if (type.equalsIgnoreCase("kia")) {
            car = new KiaCar("kia", new Car.Motor(), new Car.AutoTransmission());
            System.out.println("Car created using the second variant: " + car.getName());
            return car;
        } else if (type.equalsIgnoreCase("lamborgini")) {
            car = new LamborginiCar("lamborgini", new Car.Motor(), new Car.AutoTransmission());
            System.out.println("Car created using the second variant: " + car.getName());
            return car;
        } else if (type.equalsIgnoreCase("vaz")) {
            car = new VazCar("vaz", new Car.Motor(), new Car.AutoTransmission());
            System.out.println("Car created using the second variant: " + car.getName());
            return car;
        }
        throw new IllegalStateException("Unexpected value: " + type);
    }

}
