public class VazCar extends Car {

    public VazCar(String brand, String name) {
        super(brand, name);
    }
    public VazCar(String name) {
        super(name);
    }

    public String alloyWheels() {
        System.out.println("Имеются литые диски");
        return "";
    }
    @Override
    public void heatedSteeringWheel() {
        System.out.println("Возможность выбора интенсивности подогрева руля");
    }

    @Override
    public void movement() {

    }
}
