public class KiaCar extends Car {


    public KiaCar() {

    }

    public void setData(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }


    private String parkingSensors() {
        System.out.println("Функционирует камера заднего вида");
        return "";
    }

    @Override
    public void movement() {

    }
}
