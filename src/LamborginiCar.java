public class LamborginiCar extends Car implements SwivelWheels {

    public LamborginiCar(String brand, String name, Motor motor, AutoTransmission autoTransmission) {
        super(brand, name, motor, autoTransmission);
    }

    public LamborginiCar(String name, Motor motor, AutoTransmission autoTransmission) {
        super(name, motor, autoTransmission);
    }

    public String highSpeed() {
        return "Высокая скорость";
    }

    @Override
    public void heatedSteeringWheel(Byte intensity) {
        System.out.println("Интенсивность: " + intensity);
    }

    @Override
    public void perpendicularParking() {
        System.out.println("Перпендикулярная парковка");
    }

}
