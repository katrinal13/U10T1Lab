public class Main
{
    public static void main(String[] args)
    {
        System.out.println(factorial(5));
        System.out.println(factorial(10));
    }

    public static int factorial(int num)
    {
        int fac = num;
        while (num > 1)
        {
            num--;
            fac *= num;
        }
        return fac;
    }
}
