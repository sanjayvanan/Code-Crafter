import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateNumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine();

        String[] numbers = input.split("\\s+");
        Map<String, Integer> numberCountMap = new HashMap<>();

        for (String number : numbers) {
            if (numberCountMap.containsKey(number)) {
                
                numberCountMap.put(number, numberCountMap.get(number) + 1);
            } else {
                
                numberCountMap.put(number, 1);
            }
        }

        System.out.println("Duplicate numbers and their counts:");

        for (Map.Entry<String, Integer> entry : numberCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - Count: " + entry.getValue());
            }
        }

        scanner.close();
    }
}

this.name = name;
