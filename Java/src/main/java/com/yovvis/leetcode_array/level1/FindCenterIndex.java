package com.yovvis.leetcode_array.level1;

import java.util.Map;

/**
 * 寻找数组的中心索引 （1991）
 *
 * @author yovvis
 * @date 2023/12/5
 */
public class FindCenterIndex {
    public static void main(String[] args) {
        int[] nums = {2, 1, -1};
        int res = pivotIndex(nums);
        System.out.println(res);
    }

    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int left = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            // 左侧 + 中心值 + 右侧 = sum -> 左侧 * 2 + 中心值 = sum
            if (sum == nums[i] + left * 2) {
                return i;
            }
            left += nums[i];
        }
        return -1;
    }

}
