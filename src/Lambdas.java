import java.util.Scanner;
import java.lang.Math;

public class Lambdas {
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
        Calculation calc = (int value) ->
        {
                    if (!isFibonacci(value))
                    {
                        System.out.println("проверка на !Фибоначчи");
                        return true;
                    }
            else{System.out.println("проверка на !Фибоначчи");
                return false;}

        };

        Calculation calc1 = value ->
        {
        if (value % 15 ==0)
        {
            System.out.println("проверка деления на 15");
            return true;
        }

        else
            {
                System.out.println("проверка деления на 15");
                return false;}
        };

        Calculation calc2 = value -> {
            if (value >=0)
            {
                System.out.println("проверка на а > 0");
                return true;
            }
            else{System.out.println("проверка на а > 0");
                return false;}
        };

        Scanner scan = new Scanner(System.in);
        while (true)
        {
            int value = scan.nextInt();
            System.out.println(calc.calculation(value));
            System.out.println(calc1.calculation(value));
            System.out.println(calc2.calculation(value));
        }

    }
}

