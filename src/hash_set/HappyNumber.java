import java.util.*;

public class HappyNumber
{
    public boolean isHappy(int n)
    {
        HashSet<Integer> set = new HashSet<>();

        while(n != 1 && !set.contains(n))
        {
            set.add(n);

            int sum = 0;
            while(n > 0)
            {
                int d = n % 10;
                sum += d * d;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }

    public static void main(String[] args)
    {
        System.out.println(
                new HappyNumber().isHappy(19)
        );
    }
}