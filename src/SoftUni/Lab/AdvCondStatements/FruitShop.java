import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fruit = sc.nextLine();
        String day = sc.nextLine();
        double qty = Double.parseDouble(sc.nextLine());

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Thursday":
            case "Wednesday":
            case "Friday":
                if (fruit.equals("banana")) System.out.printf("%.2f\n", qty * 2.50);
                else if (fruit.equals("apple")) System.out.printf("%.2f\n", qty * 1.2);
                else if (fruit.equals("orange")) System.out.printf("%.2f\n", qty * 0.85);
                else if (fruit.equals("grapefruit")) System.out.printf("%.2f\n", qty * 1.45);
                else if (fruit.equals("kiwi")) System.out.printf("%.2f\n", qty * 2.7);
                else if (fruit.equals("pineapple")) System.out.printf("%.2f\n", qty * 5.5);
                else if (fruit.equals("grapes")) System.out.printf("%.2f\n", qty * 3.85);
                else System.out.println("error");
                break;
            case "Saturday":
            case "Sunday":
                if (fruit.equals("banana")) System.out.printf("%.2f\n", qty * 2.70);
                else if (fruit.equals("apple")) System.out.printf("%.2f\n", qty * 1.25);
                else if (fruit.equals("orange")) System.out.printf("%.2f\n", qty * 0.9);
                else if (fruit.equals("grapefruit")) System.out.printf("%.2f\n", qty * 1.6);
                else if (fruit.equals("kiwi")) System.out.printf("%.2f\n", qty * 3.0);
                else if (fruit.equals("pineapple")) System.out.printf("%.2f\n", qty * 5.6);
                else if (fruit.equals("grapes")) System.out.printf("%.2f\n", qty * 4.2);
                else System.out.println("error");
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
