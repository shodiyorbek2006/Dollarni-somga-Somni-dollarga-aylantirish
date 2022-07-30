import java.util.Scanner;

public class Dars34 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        KursBank curs = new KursBank();
        System.out.println("Currency Welcome!!!");
        System.out.println("[1] Dollar-so'm ");
        System.out.println("[2]Som-Dollar ");
        System.out.print("Sonni kiriting: ");
        int n = scanner.nextInt();
        if (n==1){
            System.out.println("Dollar$");
            System.out.print("Pulni kiriting: ");
            int dollar = scanner.nextInt();
            curs.dollarSom(dollar);
        }else{
            System.out.println("So'm");
            System.out.print("Pulni kiriting: ");
            int som = scanner.nextInt();
            curs.somDollar(som);
        }
    }
}
