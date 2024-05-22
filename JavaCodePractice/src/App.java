import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principle = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        double air = scanner.nextDouble();
        double air2 = air/100;
        double air2_ = air2/12;

        System.out.print("Period (Years): ");
        byte py = scanner.nextByte();
        int py2 = py*12;
        
        double value = (1+air2_);
        double value_ = Math.pow(value,(int)py2);
        double value__= air2_*value_;
        
        double value2 = (1+air2_);
        double value2_ = Math.pow(value2,(int)py2);
        double value2__ = value2_-1;

        double answer = principle*value__/value2__;

        String result = NumberFormat.getCurrencyInstance().format(answer);

        System.out.print("Mortgage: ");
        System.out.print(result);
        
    }
}
