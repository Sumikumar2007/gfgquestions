class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check karo ki kya 'complement' pehle aa chuka hai?
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Agar nahi aaya, toh current number aur uska index save kar lo
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}