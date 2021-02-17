import java.util.Arrays;

/**
 * https://leetcode.com/problems/3sum-closest/
*/
public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        int resultDiff = Integer.MAX_VALUE;
        int result = 0;

        Arrays.sort(nums);

        for (int start = 0; start < nums.length - 2; start++) {
            int mid = start + 1;
            int end = nums.length - 1;

            while (mid < end) {
                System.out.println(nums[start] + " " + nums[mid] + " " + nums[end] + " ");
                int currSum = nums[start] + nums[mid] + nums[end];
                int currDiff = target - currSum;
                if (currDiff == 0) {
                    System.out.println("Return");
                    return currSum;
                }

                if (Math.abs(currDiff) < resultDiff) {
                    resultDiff = Math.abs(currDiff);
                    result = currSum;
                }

                if (currDiff < 0) {
                    end--;
                } else {
                    mid++;
                }

            }
        }

        return result;
    }
}
