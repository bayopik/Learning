public class LamborginiCar extends Car {

    public LamborginiCar(String brand, String name) {
        super(brand, name);
    }

    public LamborginiCar(String name) {
        super(name);
    }

    public String beautifulColor() {
        System.out.println("Имеется опция выбора необычного цвета");
        return "";
    }

    @Override
    public void movement() {

    }
}
