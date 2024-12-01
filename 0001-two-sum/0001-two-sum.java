import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Use a HashMap to store numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Add the current number and its index to the map
            map.put(nums[i], i);
        }

        // Return an empty array if no solution is found (this should not happen as per the problem constraints)
        return new int[] {};
    }
}
