// интегрировать kiaCar в kia

abstract public class Car {

    /*
     *** Переменные
     */
    private String brand; // компания
    private String name; // наименование модели
    private Motor motor;
    private AutoTransmission autoTransmission;

    /*
     *** Конструктор для автомобиля
     */
    public Car(String brand, String name, Motor motor, AutoTransmission autoTransmission) {
        this.brand = brand;
        this.name = name;
        this.motor = motor;
        this.autoTransmission = autoTransmission;
    }

    public Car(String name, Motor motor, AutoTransmission autoTransmission) {
        this.name = name;
        this.motor = motor;
        this.autoTransmission = autoTransmission;
    }

    public String getName() {
        return name;
    }

    public abstract void heatedSteeringWheel(Byte intensity);

    /*
     *** Вложенные классы
     */
    // движок
    // реализовать метод Класса мотор благодаря кот заводится автомобиль
    static class Motor {
        public static final int MAX_VALUE = 200;
        private static boolean isMovement;

        public static String start() {
            return "Двигатель запущен";
        }

        public static String stop() {
            return "Двигатель остановлен";
        }
    }

    // коробка передач
    // переключение авто (скорости) реализовывалось через метод (сдача назад, нейтралка, драйв, паркинг)
    static class AutoTransmission {
        public static final String TYPE_TRANSMISSON = "automatic";
    }

    /*
     *** Общий для всех автомобилей функционал
     */
    //бизнес логика
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
