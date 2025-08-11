class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int preFixSum=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            preFixSum+=nums[i];
            if(map.containsKey(preFixSum-k))
            {
                count+=map.get(preFixSum-k);
            }
            map.put(preFixSum,map.getOrDefault(preFixSum,0)+1);
        }

        return count;
    }
}