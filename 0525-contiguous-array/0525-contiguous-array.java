class Solution {
    public int findMaxLength(int[] arr) {
        int sum=0;
        int max=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                sum+=-1;
            }
            else if(arr[i]==1)
            {
                sum+=1;
            }
            
            if(map.containsKey(sum))
            {
                max=Math.max(max,i-map.get(sum));
            }
            else
            {
                map.put(sum,i);
            }
        }
        return max;
    }
}