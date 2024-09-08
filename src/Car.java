abstract public class Car implements Movement {

    /*
     *** Переменные
    */
    String brand; // компания
    String name; // наименование модели
    Motor motor;
    AutoTransmission autoTransmission;
    Boolean isBroken = false;


    /*
     *** Конструктор для автомобиля
    */
    public Car(String brand, String name) {
        this.brand = brand;
        this.name = name;
        this.motor = new Motor();
        this.autoTransmission = new AutoTransmission();
    }

    public Car(String name) {
        this.name = name;
        this.motor = new Motor();
        this.autoTransmission = new AutoTransmission();
    }

    public Car() {

    }

    public String getName() {
        return name;
    }

    /*
     *** Вложенные классы
    */
    // движок
    class Motor {
        public static final int MAX_VALUE = 200;
    }

    // коробка передач
    class AutoTransmission {
        public static final String TYPE_TRANSMISSON = "automatic";
    }

    /*
     *** Общий для всех автомобилей функционал
    */
    public void heatedSteeringWheel() {
        System.out.println("Подогрев руля");
    }

    public String heatedWindshield() {
        System.out.println("Подогрев лобового стекла");
        return "";
    }

    public String equippedWithSubwoofers() {
        System.out.println("Включение сабвуфера");
        return "";
    }
}
