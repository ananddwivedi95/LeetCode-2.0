class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)
        {
            return true;
        }
        long left=1;
        long right=num;
        while(left<=right)
        {
            long mid=left+(right-left)/2;
            long squrt=mid*mid;
            if(squrt==num)
            {
                return true;
            }
            else if(squrt>num)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return false;
    }
}