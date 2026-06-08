import java.util.*;

public class LongestConsecutive
{
    public int longestConsecutive(int[] nums)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums)
            set.add(n);

        int max = 0;

        for(int n : set)
        {
            if(!set.contains(n - 1))
            {
                int len = 1;

                while(set.contains(n + len))
                    len++;

                max = Math.max(max, len);
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        int[] nums = {100, 4, 200, 1, 3, 2};

        System.out.println(
                new LongestConsecutive().longestConsecutive(nums)
        );
    }
}