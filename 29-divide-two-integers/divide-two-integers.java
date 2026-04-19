class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==0){
            return 0;
        }
        else if(divisor==0){
            return 0 ;
        }
        else if(divisor==1){
            return dividend;
        }
        else if(dividend==divisor){
            return 1;
        }
        else if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        else{
            return   dividend/divisor;
        }
    }
}