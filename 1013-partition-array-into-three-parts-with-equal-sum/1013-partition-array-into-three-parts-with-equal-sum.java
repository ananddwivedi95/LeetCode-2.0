class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        if(sum%3!=0)
        {
            return false;
        }
        int currentSum=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            currentSum+=arr[i];
            if(currentSum==sum/3)
            {            
                count++;
                currentSum=0;
                if(count==2 && i<n-1)
                {
                    return true;
                }
            }
        }
      return false;
    }
}
