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




    public String parkingSensors() {
        System.out.println("Имеется парктроник");
        return "";
    }

    @Override
    public void movement() {

    }
}
