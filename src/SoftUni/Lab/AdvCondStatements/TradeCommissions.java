import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String city=sc.nextLine();
        double sells=Double.parseDouble(sc.nextLine());

        switch (city) {
            case "Sofia":
                if(sells<0)System.out.println("error");
                else if(sells<=500)System.out.printf("%.2f\n",sells*0.05);
                else if(sells<=1000)System.out.printf("%.2f\n",sells*0.07);
                else if(sells<=10000)System.out.printf("%.2f\n",sells*0.08);
                else System.out.printf("%.2f\n",sells*0.12);
                break;
            case "Varna":
                if(sells<0)System.out.println("error");
                else if(sells<=500)System.out.printf("%.2f\n",sells*0.045);
                else if(sells<=1000)System.out.printf("%.2f\n",sells*0.075);
                else if(sells<=10000)System.out.printf("%.2f\n",sells*0.1);
                else System.out.printf("%.2f\n",sells*0.13);
                break;
            case"Plovdiv":
                if(sells<0)System.out.println("error");
                else if(sells<=500)System.out.printf("%.2f\n",sells*0.055);
                else if(sells<=1000)System.out.printf("%.2f\n",sells*0.08);
                else if(sells<=10000)System.out.printf("%.2f\n",sells*0.12);
                else System.out.printf("%.2f\n",sells*0.145);
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
