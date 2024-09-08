public class LamborginiCar extends Car {

    public LamborginiCar(String brand, String name) {
        super(brand, name);
    }

    public LamborginiCar(String name) {
        super(name);
    }

    private String highSpeed() {
        System.out.println("Высокая скорость");
        return "";
    }

    @Override
    public void movement() {

    }
}
