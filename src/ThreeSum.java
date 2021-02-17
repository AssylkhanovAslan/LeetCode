import java.util.*;

/**
 * https://leetcode.com/problems/3sum/
 */

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return Collections.emptyList();
        }

        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);

        for (int start = 0; start < nums.length - 2; start++) {
            int mid = start + 1;
            int end = nums.length - 1;

            while (mid < end) {
                int sum = nums[start] + nums[mid] + nums[end];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[start], nums[mid], nums[end]));
                    mid++;
                    end--;

                    if (mid + 1 < end && nums[mid] == nums[mid + 1]) {
                        mid++;
                    }
                    if (mid < end - 1 && nums[end] == nums[end - 1]) {
                        end--;
                    }
                } else if (sum < 0) {
                    mid++;
                } else {
                    end--;
                }
            }

            while(start < nums.length - 2 && nums[start] == nums[start + 1]) {
                start++;
            }
        }

        return new ArrayList<>(result);

    }

}
