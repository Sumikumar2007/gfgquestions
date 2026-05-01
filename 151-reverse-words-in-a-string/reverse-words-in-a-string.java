class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        
        //Lo itni madad kardi hai abh is words array me saare words as elements agaye hai
       int left = 0;
        int right = words.length - 1;
        
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        
        return String.join(" ", words);
    }
}