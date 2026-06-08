import java.util.*;

public class FirstRepeated
{
    public int firstRepeated(int[] nums)
    {
        HashSet<Integer> set = new HashSet<>();

        for(int n : nums)
        {
            if(set.contains(n))
                return n;

            set.add(n);
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] nums = {2, 5, 1, 2, 3, 5};

        System.out.println(
                new FirstRepeated().firstRepeated(nums)
        );
    }
}