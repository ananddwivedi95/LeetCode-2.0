class Solution {
    public int pivotIndex(int[] arr) {
        //using prefix and sufix sum approach
        
        int[] prefix= new int[arr.length];
        int[] sufix= new int[arr.length];
        
        // for prefix calculation
        
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }
        
        //for sufix calculation
        
        sufix[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            sufix[i]=sufix[i+1]+arr[i];
        }
        
        for(int i=0;i<arr.length;i++)
        {
            if(prefix[i]==sufix[i])
            {
                return i;
            }
        }
        return -1;
    }
}