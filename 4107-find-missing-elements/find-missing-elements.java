class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;

        
        HashSet<Integer> set = new HashSet<>();
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            set.add(num);
            if (num < min) min = num;
            if (num > max) max = num;
        }
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                result.add(i); // Agar missing hai toh list mein daal do
            }
        }

        return result;
    }
}