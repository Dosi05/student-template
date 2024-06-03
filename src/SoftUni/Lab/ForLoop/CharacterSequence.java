import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();
        int len=text.length();

        for(int i=0;i<len;i++){
            System.out.printf("%c\n",text.charAt(i));
        }
    }    
}
