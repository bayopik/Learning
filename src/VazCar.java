public class VazCar extends Car {

     String intensity;

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
    public void heatedSteeringWheel(String intensity) {
        System.out.println(intensity);
    }

    @Override
    public void movement() {

    }
}
