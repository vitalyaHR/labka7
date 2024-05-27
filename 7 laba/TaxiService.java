import java.util.ArrayList;
import java.util.Random;

public class TaxiService {

    public void Taxi() {

        ArrayList<Car> cars = new ArrayList<>();
        Random random = new Random();

        cars.add(new Car("Toyota Camry", 150, new Driver("Ахмєд", 35, 10), 15000, 2018));
        cars.add(new Car("Honda Civic", 120, new Driver("Володя", 28, 6), 12000, 2019));
        cars.add(new Car("Ford Focus", 130, new Driver("Владислав", 40, 15), 13000, 2017));
        cars.add(new Car("Chevrolet Cruze", 140, new Driver("Анна", 32, 8), 14000, 2016));
        cars.add(new Car("Volkswagen Passat", 160, new Driver("Давид", 37, 12), 16000, 2015));
        cars.add(new Car("Hyundai Elantra", 125, new Driver("Iван", 30, 7), 12500, 2020));
        cars.add(new Car("Nissan Altima", 135, new Driver("Данило", 33, 9), 13500, 2014));
        cars.add(new Car("Kia Optima", 155, new Driver("Вєрка Сердючка", 31, 11), 15500, 2013));
        cars.add(new Car("Mazda 6", 145, new Driver("Андрiй", 38, 13), 14500, 2012));
        cars.add(new Car("Subaru Legacy", 170, new Driver("ОляUA", 34, 14), 17000, 2011));

        for (int i = 0; i < cars.size() / 2; i++) {
            Car car = cars.get(i);
            car.setEnginePower(car.getEnginePower() * 1.1); 
            Driver driver = car.getDriver();
            car.setDriver(new Driver(driver.getName(), driver.getAge(), 5)); 
        }

        for (int i = 0; i < cars.size(); i += 2) {
            Car car = cars.get(i);
            car.setEnginePower(car.getEnginePower() * 1.1); 
            car.setPrice(car.getPrice() * 1.05); 
        }

        for (Car car : cars) {
            Driver driver = car.getDriver();
            if (driver.getDrivingExperience() < 5 && driver.getAge() > 25) {
                driver.setDrivingExperience(driver.getDrivingExperience() + 1);
            }
        }

        Car randomCar = Helper.getRandomCar(cars);
        System.out.println("Автомобiль марки " + randomCar.getBrand() + " з водiєм " + randomCar.getDriver().getName() + " виїхав за вами.");
        System.out.println("Водiй " + randomCar.getDriver().getName() + " прибув на мiсце.");
    }
}