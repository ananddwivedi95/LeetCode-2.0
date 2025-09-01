class Solution {
    public int maxSubArray(int[] nums) {


        int prefixSum=0;
        int max=Integer.MIN_VALUE;

    for(int i=0;i<nums.length;i++)
    {
        prefixSum+=nums[i];
        max=Math.max(max,prefixSum);

        if(prefixSum<0)
        {
            prefixSum=0;
        }
    }
    return max;
    }
}