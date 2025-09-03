class Solution {
    public int findNthDigit(int n) {

        long rem=n;
        long digits=1;
        long cnt=9;

        while(rem>cnt*digits){
            rem-=cnt*digits;

            digits+=1;
            cnt*=10;
        }

        rem-=1; //to get before number

        long p1=rem/digits;
        long number=1;
        int d=(int)digits;
        while(d>1){
            number*=10;

            d-=1;
        }
        number=number+p1;
        int p2=(int)(rem%digits);
        String s=String.valueOf(number);
        return s.charAt(p2)-'0';

       
    }
}