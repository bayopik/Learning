public class KiaCar extends Car {

    public KiaCar(String name, Motor motor, AutoTransmission autoTransmission) {
        super(name, motor, autoTransmission);
    }

    public KiaCar(String brand, String name, Motor motor, AutoTransmission autoTransmission) {
        super(brand, name, motor, autoTransmission);
    }

    @Override
    public void heatedSteeringWheel(Byte intensity) {
        System.out.println("Интенсивность: " + intensity);
    }

    public String parkingSensors() {
        return "Функционирует камера заднего вида";
    }

}
