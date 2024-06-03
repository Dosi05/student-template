import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());
        int sumE=0,sumO=0;

        for(int i=0;i<n;i++){
            if(i%2==0||i==0)sumE+=Integer.parseInt(sc.nextLine());
            else sumO+=Integer.parseInt(sc.nextLine());
        }

        if(sumE==sumO)System.out.printf("Yes\nSum = %d",sumE);
        else System.out.printf("No\nDiff = %d",Math.abs(sumE-sumO));
    }    
}
