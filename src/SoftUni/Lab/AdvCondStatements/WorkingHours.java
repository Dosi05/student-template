import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int hour=Integer.parseInt(sc.nextLine());
        String day =sc.nextLine();

        switch (day){
            case "Monday":
            case "Thursday":
            case "Wednesday":
            case "Tuesday":
            case "Friday":
            case "Saturday":
                if(10<=hour&&hour<=18)System.out.println("open");
                else System.out.println("closed");
                break;
            default:
                System.out.println("closed");
                break;
        }
    }
    
}
