public class RemoveElement_InPlace {
    public static int removeElement(int[] nums, int val) {
        int finalSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[finalSize] = nums[i];
                finalSize += 1;
            }
        }
        return finalSize;
    }
}
