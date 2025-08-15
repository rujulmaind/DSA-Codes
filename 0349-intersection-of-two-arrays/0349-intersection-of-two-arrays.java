import java.util.*;

public class Solution {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) set1.add(num);
        Set<Integer> result = new HashSet<>();
        for (int num : nums2) if (set1.contains(num)) result.add(num);
        int[] res = new int[result.size()];
        int i = 0;
        for (int num : result) res[i++] = num;
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
