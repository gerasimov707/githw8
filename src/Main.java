import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> bag = new ArrayList<>();
        while (true) {
            System.out.println("1.добавить\n2.показать\n3.удалить");
            System.out.println("выберите операцию");
            String operation = scanner.next();

            switch (operation) {
                case ("1"): {
                    System.out.println("какую покупку добавить?");
                    bag.add(scanner.next());
                    System.out.println("итого в списке:");
                    System.out.println("↓");
                    System.out.println(bag.size());
                    break;
                }
                case ("2"): {
                    showPurchase(bag);
                    break;
                }
                case ("3"): {
                    showPurchase(bag);
                    System.out.println("");
                    String numberOrPurchase = scanner.next();
                    try {
                        int number = Integer.parseInt(numberOrPurchase);
                        bag.remove(number );
                    }catch (NumberFormatException e){
                        bag.remove(numberOrPurchase);
                    }
                    break;
                }
                default: {
                    System.out.println("операции не существует");
                }
            }
        }
    }
    public static void showPurchase (List < String > bag) {
        int count = 1;
        System.out.println("список покупок:");
        for (String purchase : bag) {
            System.out.printf("%d.%s\n " + "\n", count , purchase);
            count++;
        }
    }
}
