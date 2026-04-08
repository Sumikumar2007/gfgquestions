import java.util.*;

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int s) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int n = arr.length;
        int start = 0, sum = 0;

        for (int end = 0; end < n; end++) {
            sum += arr[end];

            while (sum > s && start < end) {
                sum -= arr[start];
                start++;
            }

            if (sum == s) {
                result.add(start + 1); 
                result.add(end + 1);
                return result;
            }
        }

        result.add(-1);
        return result;
    }
}