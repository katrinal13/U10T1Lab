public class Fibonacci
{
    public static void main(String[] args)
    {
        System.out.print(fibonacci(10));
    }

    private static int fibonacci(int x)
    {
        if(x == 1 || x == 2)
        {
            return 1;
        }

        // double recursive method call
        return fibonacci(x - 1) + fibonacci(x - 2);
    }
}
