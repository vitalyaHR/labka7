import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    
    public void Book() {
        
        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Makes kebab", "123-456-7489");
        phoneBook.put("Johny", "234-567-8920");
        phoneBook.put("Kyivstar", "345-678-9901");
        phoneBook.put("Poroshenko", "456-789-0612");
        phoneBook.put("Guts", "567-890-1223");
        phoneBook.put("Dmytro", "678-901-9234");
        phoneBook.put("Yurii", "789-012-3445");
        phoneBook.put("Volodya", "890-123-4756");
        phoneBook.put("Petro", "901-234-5467");
        phoneBook.put("Oleg", "012-345-2678");

        String removedLastName = "Volodya";
        phoneBook.remove(removedLastName);
        System.out.println("Запис для " + removedLastName + " видалено.");
        
        System.out.println("Перелiк iмен:");
        for (String name : phoneBook.keySet()) {
            System.out.println(name);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введiть iм'я для пошуку номера телефону: ");
        String name = scanner.nextLine();
        findPhoneNumberByName(phoneBook, name);
    }

    public static void findPhoneNumberByName(Map<String, String> phoneBook, String name) {
        if (phoneBook.containsKey(name)) {
            String phoneNumber = phoneBook.get(name);
            System.out.println("Номер телефону для " + name + ": " + phoneNumber);
        } else {
            System.out.println("У книзi вiдсутнiй абонент з iм'ям " + name);
        }
    }
}