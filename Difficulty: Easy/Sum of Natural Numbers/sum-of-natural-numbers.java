// User function Template for Java

class Solution {
    static int sumOfNaturals(int n) {
        // code here
        if (n==0) return 0;
         int count=0;
        for(int i=0;i<=n;i++){
            count+=i;
        }
        return count;
    }
};