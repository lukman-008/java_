import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Amount = s.nextInt();
        if (Amount>0&&Amount<=5000)
        {
            System.out.println("Your Amount is "+Amount);
        } else if (Amount>=5001&Amount<=7000) {
            System.out.println("Your Amount is "+(Amount-(Amount/10)));

        }else if (Amount>=7001&Amount<=10000) {
            System.out.println("Your Amount is "+(Amount-(Amount*2/10)));

        }else if (Amount>=10000) {
            System.out.println("Your Amount is "+(Amount-(Amount*3/10)));

        }
    }
}
