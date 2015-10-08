public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length < 1)
        return 0;
    int left = 0, right = nums.length - 1;

    while (left <= right) {

        while (right > left && nums[right] == val)
            right--;
        if (nums[left] == val) {
            nums[left] = nums[right];
            right--;
        }
        left++;
    }

    return right + 1;
    }
}