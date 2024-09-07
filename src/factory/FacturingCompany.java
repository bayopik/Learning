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
}
