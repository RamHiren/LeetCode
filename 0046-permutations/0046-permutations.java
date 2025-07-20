import java.util.*;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        l.add(new ArrayList<>());

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (l.size() == 1 && l.get(0).isEmpty()) {
                List<Integer> first = new ArrayList<>();
                first.add(num);
                l.set(0, first); // replace the empty list
                continue;
            }

            List<List<Integer>> m = l;
            List<List<Integer>> n = new ArrayList<>();

            for (List<Integer> j : m) {
                for (int k = 0; k <= j.size(); k++) {
                    List<Integer> temp = new ArrayList<>(j);
                    temp.add(k, num);
                    n.add(temp);
                }
            }

            l = n;
        }

        return l;
    }
}