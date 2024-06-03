import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num =Integer.parseInt(sc.nextLine());

        if(!(100<=num&&num<=200||num==0))System.out.println("invalid");
    }
}
