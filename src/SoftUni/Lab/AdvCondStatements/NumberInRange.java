import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=Integer.parseInt(sc.nextLine());

        if(-100<=num&&num<=100&&num!=0)System.out.println("Yes");
        else System.out.println("No");
    }
}
