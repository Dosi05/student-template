import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String product=sc.nextLine();
        String city=sc.nextLine();
        double qty=Double.parseDouble(sc.nextLine());

        switch (city) {
            case "Sofia":
                switch (product){
                    case "coffee":
                        System.out.println(qty*0.5);
                        break;
                    case "water":
                        System.out.println(qty*0.8);
                        break;
                    case "beer":
                        System.out.println(qty*1.2);
                        break;
                    case "sweets":
                        System.out.println(qty*1.45);
                        break;
                    case "peanuts":
                        System.out.println(qty*1.60);
                        break;
                    }
                break;
            case "Plovdiv":
                switch (product){
                    case "coffee":
                        System.out.println(qty*0.4);
                     break;
                    case "water":
                        System.out.println(qty*0.7);
                        break;
                    case "beer":
                        System.out.println(qty*1.15);
                        break;
                    case "sweets":
                        System.out.println(qty*1.30);
                        break;
                    case "peanuts":
                        System.out.println(qty*1.50);
                        break;
                }
                break;
            case "Varna":
                switch (product){
                    case "coffee":
                        System.out.println(qty*0.45);
                     break;
                    case "water":
                        System.out.println(qty*0.7);
                        break;
                    case "beer":
                        System.out.println(qty*1.1);
                        break;
                    case "sweets":
                        System.out.println(qty*1.35);
                        break;
                    case "peanuts":
                        System.out.println(qty*1.55);
                        break;
                }
                break;
        }

    }
}
