class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int rightSmallest=0;
        int leftGreater=0;
        if(right.length!=0)
        {
           Arrays.sort(right);
           rightSmallest=right[0];
        }
        if(left.length!=0)
        {
           Arrays.sort(left);
           leftGreater=left[left.length-1];
        }
        int lastTimeRight=0;
        if(right.length!=0)
        {
           lastTimeRight =n-rightSmallest;
        }
        int lastTimeLeft=0;
        if(left.length!=0)
        {
            lastTimeLeft=leftGreater-0;
        }
        if(lastTimeRight>lastTimeLeft)
        {
            return lastTimeRight;
        }
        return lastTimeLeft;
    }
}