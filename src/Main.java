import factory.*;
import factory.Car;

import java.util.*;
import java.util.Random;

/*
Тебе нужно:
1) Создать автомобилестроительную компанию.
Она в свою очередь может изготавливать автомобили разных фирм.
2) Каждый автомобиль должен иметь как общий со всеми функционал, так и свой личный.
3) Каждый автомобиль должен быть оснащён мотором и автоматической коробкой передач
4) Создать 10 автомобилей разных фирм
5) Несколько автомобилей должны выехать на разные трассы
6) Некоторые автомобили не должны выехать никуда и сломаться на самом заводе :)
7) 2 автомобиля из выехавших должны сломаться по дороге
8) Оставшиеся авто должны доехать


Что ты должен использовать в своем проекте ОБЯЗАТЕЛЬНО:
1. Наследование, полиморфизм и инкапсуляцию
2. STATIC
3. Константу
4. Вложенный класс
5. 5 машин проинициализировать через конструктор. Остальные 5 машин через сеттеры.
6. return в методах (не во всех)
7. ЛОГИКУ!)))) Чтобы всё было максимально логично. Советую на листочке нарисовать сначала, если не знаешь что куда и как)
8. Интерфейс и абстрактный класс
9. Перегрузку. Даже если не всё будет вызываться.

И задание со звездочкой:
1. Реализовать паттерн фабрика, который бы создавал тебе любую из машин.
2. Реализовать паттерн строитель (Builder) и воспользоваться им.
*/
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



    }
}
