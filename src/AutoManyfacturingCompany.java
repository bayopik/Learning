import java.util.ArrayList;
import java.util.Collections;

class AutoManyfacturingCompany {

    private Car[] cars;

    public AutoManyfacturingCompany() {
        cars = new Car[10];
        creatingAuto();
    }

    /*
     *** Создание объектов
     */
    void creatingAuto() {
        cars[0] = new KiaCar("zeroKia", new Car.Motor(), new Car.AutoTransmission());
        cars[1] = new VazCar("firstLada", new Car.Motor(), new Car.AutoTransmission());
        cars[1].heatedSteeringWheel((byte) 3);
        cars[2] = new VazCar("vaz", "secondLada", new Car.Motor(), new Car.AutoTransmission());
        cars[2].heatedSteeringWheel();
        cars[3] = new VazCar("vaz", "thirdLada", new Car.Motor(), new Car.AutoTransmission());
        cars[3].heatedSteeringWheel((byte) 2);
        cars[4] = new LamborginiCar("lamborgini", "firstLamborgini", new Car.Motor(), new Car.AutoTransmission());
        cars[5] = new LamborginiCar("secondLamborgini", new Car.Motor(), new Car.AutoTransmission());
        cars[6] = new LamborginiCar("thirdLamborgini", new Car.Motor(), new Car.AutoTransmission());
        cars[7] = new KiaCar("firstLada", new Car.Motor(), new Car.AutoTransmission());
        cars[7].heatedSteeringWheel((byte) 3);
        cars[8] = new KiaCar("secondLada", new Car.Motor(), new Car.AutoTransmission());
        cars[9] = new KiaCar("KIA", "thirdLada", new Car.Motor(), new Car.AutoTransmission());

    }

    public void testCar(ArrayList<Road> roads) {

        ArrayList<Car> arrForAddChecking = new ArrayList<>();
        for (Car car : cars) {
            if (Math.random() < 0.15) {
                Collections.shuffle(roads);
                System.out.println("Не поехала машина " + car.getName());
            } else {
                Collections.shuffle(roads);
                System.out.println(Car.Motor.start() + ". Поехала машина " + car.getName() + " по " + roads.get(0).getName());
                arrForAddChecking.add(car);
            }
        }

        Collections.shuffle(arrForAddChecking);
        Byte arrForAddCheckingCounter = 0;

        for (Car car: arrForAddChecking) {
            if (arrForAddCheckingCounter < 2) {
                Collections.shuffle(roads);
                System.out.println(Car.Motor.stop() + ". Машина "  + car.getName() + " поломалась на " + roads.get(0).getName());
                arrForAddCheckingCounter++;
            }
        }
    }
}

