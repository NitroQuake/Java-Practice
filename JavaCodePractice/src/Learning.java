import java.text.NumberFormat;
import java.util.Scanner;

public class Learning {
    public static void main(String[] args) throws Exception {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);

        int principal = 0;
        float annual = 0;
        float Annual = 0;
        byte years = 0;
        int Years = 0;

        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal < 1000) {
                System.out.println("Enter a number between 1,000 and 1,000,000.");
                continue;
            }
            if (principal > 1000000) {
                System.out.println("Enter a number between 1,000 and 1,000,000.");
                continue;
            }
            
            break;
        }
        while (true) {
            System.out.print("Annual Interest Rate: ");
            annual = scanner.nextFloat();
            if (annual <= 0) {
                System.out.println("Enter a value greater than 0 and less than or equal to 30.");
                continue;
            }
            if (annual > 30) {
                System.out.println("Enter a value greater than 0 and less than or equal to 30.");
                continue;
            }
            Annual = annual/PERCENT/MONTHS_IN_YEAR;
            break;
        }
        while (true) {
            System.out.print("Period (Years): ");
            years = scanner.nextByte();
            if (years < 1) {
                System.out.println("Enter a value between 1 and 30.");
                continue;
            }
            if (years > 30) {
                System.out.println("Enter a value between 1 and 30.");
                continue;
            }
            Years = years*MONTHS_IN_YEAR;
            break;
        }
        double mortgage = principal 
        * (Annual*Math.pow(1+Annual, Years))
        / (Math.pow(1+Annual, Years)-1);
        double Mortgage = Math.round(mortgage*100);
        double MOrtgage = Mortgage/100;
        System.out.println("Mortage: "+NumberFormat.getCurrencyInstance().format(MOrtgage));
    }
}
