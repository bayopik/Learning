package factory;

public class FacturingCompany {
    public Car createCar(CarEnum type) {
        Car car = null;
        switch (type) {
            case KIA:
                car = new Kia("kia");
                break;
            case LAMBORGINI:
                car = new Lamborgini("lamborgini");
                break;
            case VAZ:
                car = new Vaz("vaz");
                break;
        }
        System.out.println("Car created: " + car.getModel());
        return car;
    }

    public Car createCar(String type) {
        Car car = null;
        if (type.equalsIgnoreCase("kia")) {
            car = new Kia("kia");
            System.out.println("Car created using the second variant: " + car.getModel());
            return car;
        } else if (type.equalsIgnoreCase("lamborgini")) {
            car = new Lamborgini("lamborgini");
            System.out.println("Car created using the second variant: " + car.getModel());
            return car;
        } else if (type.equalsIgnoreCase("vaz")) {
            car = new Vaz("vaz");
            System.out.println("Car created using the second variant: " + car.getModel());
            return car;
        }
        return car;
    }

}
