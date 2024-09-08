public class VazCar extends Car {

    public VazCar(String brand, String name) {
        super(brand, name);
    }
    public VazCar(String name) {
        super(name);
    }

    private String spinningAlloyWheels() {
        System.out.println("Прокручивающиеся литые диски");
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
