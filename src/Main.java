import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
         *** Основная часть
         */
        AutoManyfacturingCompany autoManyfacturingCompany = new AutoManyfacturingCompany();
        Road road1 = new Road("Трасса №1");
        Road road2 = new Road("Трасса №2");
        ArrayList<Road> roads = new ArrayList<>();
        roads.add(road1);
        roads.add(road2);
        autoManyfacturingCompany.testCar(roads);

        /*
         *** Паттерн Builder
         */
        CreateCarThrouhtPattern concreteCar = new CreateCarThrouhtPattern.Builder()
                .withModel("J7")
                .withBrand("Jac")
                .withGeneration((short) 2022)
                .build();
        System.out.println(concreteCar.getModel());

        /*
         *** Паттерн Factory
         */
        FacturingCompany facturingCompany = new FacturingCompany();
        Car lamborgini = facturingCompany.createCar(CarEnum.LAMBORGINI);
        Car vaz = facturingCompany.createCar(CarEnum.VAZ);
        Car kia = facturingCompany.createCar(CarEnum.KIA);

        Car lamborginiSecondVariant = facturingCompany.createCar("LAMBORGINI");
        Car vazSecondVariant = facturingCompany.createCar("VAZ");
        Car kiaSecondVariant = facturingCompany.createCar("KIA");



    }
}
