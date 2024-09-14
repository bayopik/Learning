public class VazCar extends Car {

    public VazCar(String brand, String name, Motor motor, AutoTransmission autoTransmission) {
        super(brand, name, motor, autoTransmission);
    }

    public VazCar(String name, Motor motor, AutoTransmission autoTransmission) {
        super(name, motor, autoTransmission);
    }

    public String spinningAlloyWheels() {
        return "Прокручивающиеся литые диски";
    }

    @Override
    public void heatedSteeringWheel(Byte intensity) {
        System.out.println(intensity);
    }

}
