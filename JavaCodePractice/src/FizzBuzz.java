import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) throws Exception { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int div = scanner.nextInt();

        if (div % 15 == 0) 
            System.out.println("FizzBuzz");
        else if (div % 3 == 0)
            System.out.println("Buzz");
        else if (div % 5 == 0)
            System.out.println("Fizz");
        else
            System.out.println(div);


    }
}
