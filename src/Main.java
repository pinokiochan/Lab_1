import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(
                """
                        1. Minimum of an array
                        2. Average of an array
                        3. Prime or composite
                        4. Factorial
                        5. Fibonacci
                        6. Power
                        7. Reverse an array
                        8. Check if all digits
                        9. Binomial coefficient
                        10. Greatest common denominator
                        Pick a function:""");
        int pick = sc.nextInt();
        switch(pick){
            case 1:
                MinimumElementFinder.run();
                break;
            case 2:
                AverageOfThem.run();
                break;
            case 3:
                WhereIsMyPrime.run();
                break;
            case 4:
                Factorial.run();
                break;
            case 5:
                FibonacciSeries.run();
                break;
            case 6:
                ExponentialCalculator.run();
                break;
            case 7:
                ReverseOrderOfArray.run();
                break;
            case 8:
                IsDigitAll.run();
                break;
            case 9:
                BinomialCoefficient.run();
                break;
            case 10:
                GCD.run();
                break;
        }
    }
}