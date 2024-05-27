import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput;

        while (true) {

            System.out.println("Введiть номер завдання (1; 2), або 'q' для виходу:");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("q")) {
                return;
            }

            switch (userInput) {
                case "1":
                    System.out.println("-------------------------------");
                    TaxiService task1 = new TaxiService();
                    task1.Taxi();
                    System.out.println("-------------------------------");
                    break;
                case "2":
                    System.out.println("-------------------------------");
                    PhoneBook task2 = new PhoneBook();
                    task2.Book();
                    System.out.println("-------------------------------");
                    break;
                default:
                    System.out.println("Неправильний ввiд. Введiть номер завдання (1; 2) або 'q' для виходу.");
                    break;
            }
        }
    }
}