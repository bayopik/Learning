import java.util.ArrayList;
import java.util.Collections;

class AutoManyfacturingCompany {

    public Car[] cars;

    public AutoManyfacturingCompany() {
        cars = new Car[10];
        creatingAuto();
    }

    /*
     *** Создание объектов
     */
    void creatingAuto() {
        cars[0] = new KiaCar();
        cars[1] = new VazCar("vaz", "firstLada");
        cars[1].heatedSteeringWheel("Интенсивность сильная");
        cars[2] = new VazCar("secondLada");
        cars[2].heatedSteeringWheel();
        cars[3] = new VazCar("thirdLada");
        cars[3].heatedSteeringWheel("Интенсивность средняя");
        cars[4] = new LamborginiCar("lamborgini", "firstLamborgini");
        cars[5] = new LamborginiCar("secondLamborgini");
        cars[6] = new LamborginiCar("thirdLamborgini");

        KiaCar carForSetter1 = new KiaCar();
        carForSetter1.setData("kia1", "KIA");
        cars[7] = carForSetter1;

        KiaCar carForSetter2 = new KiaCar();
        carForSetter2.setName("kia2");
        cars[8] = carForSetter2;

        KiaCar carForSetter3 = new KiaCar();
        carForSetter3.setData("kia3", "KIA");
        carForSetter3.setName("kia4_new");
        cars[9] = carForSetter3;

    }

    public void testCar(ArrayList<Road> roads) {

        ArrayList<Car> arrForAddChecking = new ArrayList<>();
        for (Car car : cars) {
            if (Math.random() < 0.15) {
                Collections.shuffle(roads);
                System.out.println("Не поехала машина " + car.getName());
            } else {
                Collections.shuffle(roads);
                System.out.println("Поехала машина " + car.getName() + " по " + roads.get(0).getName());
                arrForAddChecking.add(car);
            }
        }

        Collections.shuffle(arrForAddChecking);
        Byte arrForAddCheckingCounter = 0;

        for (Car car: arrForAddChecking) {
            if (arrForAddCheckingCounter < 2) {
                Collections.shuffle(roads);
                System.out.println("Машина "  + car.getName() + " поломалась на " + roads.get(0).getName());
                arrForAddCheckingCounter++;
            }
        }
    }
}
