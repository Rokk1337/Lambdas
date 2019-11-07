import java.util.Scanner;

public class Lambdas
{
    interface Calculation
    {
        public boolean calculation(int value);
    }

    static boolean isPerfectSquare(int x)
    {
        int s = (int)Math.sqrt(x);
        return (s*s == x);
    }

    static boolean isFibonacci(int n)
    {
        return isPerfectSquare(5 * n * n + 4) ||
                isPerfectSquare(5 * n * n - 4);
    }

    public static void main(String[] args)
    {
        Calculation calc1 = (int value) ->
        {
            if (value % 15 == 0)
            {
                return true;
            }
            return false;
        };

        Calculation calc2 = (int value) ->
        {
            if (value >= 0)
            {
                return true;
            }
            return false;
        };

        Calculation calc3 = (int value) ->
        {
            if (!isFibonacci(value))
            {
                return true;
            }
            return false;
        };

        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            if (scanner.hasNextInt())
            {
                int value = scanner.nextInt();
                System.out.println("value % 15 == 0 -> " + calc1.calculation(value));
                System.out.println("value > 0 -> " + calc2.calculation(value));
                System.out.println("value is not Fibonacci -> " + calc3.calculation(value));
            }
            else if (scanner.hasNext("exit"))
            {
                return;
            }
            else
            {
                scanner.nextLine();
            }
        }
    }
}
