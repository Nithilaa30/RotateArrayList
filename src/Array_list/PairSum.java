import java.util.*;

public class PairSum
{
    public boolean hasPairWithSum(ArrayList<Integer> list, int target)
    {
        HashSet<Integer> set = new HashSet<>();

        for(int x : list)
        {
            if(set.contains(target - x))
                return true;

            set.add(x);
        }
        return false;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 7, 11, 15));

        System.out.println(new PairSum().hasPairWithSum(list, 9));
    }
}