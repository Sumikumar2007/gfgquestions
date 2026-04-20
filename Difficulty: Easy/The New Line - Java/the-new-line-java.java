class Solution {
    public void printWords(String sentence) {
        // code here
        String [] str=sentence.split(" ");
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }
}