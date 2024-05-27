import java.util.ArrayList;
import java.util.Random;

class Helper {
    public static Car getRandomCar(ArrayList<Car> cars) {
        Random random = new Random();
        return cars.get(random.nextInt(cars.size()));
    }
}