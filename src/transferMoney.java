import java.util.Scanner;
public class transferMoney {
    public static void main(String[] args) {
        System.out.println("Enter dollar");
        Scanner Scanner = new Scanner(System.in);
        double dollar = Scanner.nextDouble();
        double vietnam = dollar *22000;
        System.out.printf("You have %.1f VND",vietnam);
    }
}
