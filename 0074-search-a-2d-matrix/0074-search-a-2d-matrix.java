class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        
         for(int i=0;i<mat.length;i++)
        {
            if(binarySearch(target,mat[i]))
            {
                return true;
            }
        }
        return false;
    }
    
    public static boolean binarySearch(int target, int[] arr)
    {
        int left=0;
        int right=arr.length-1;
        
        while(left<=right)
        {
            int mid=(left+right)/2;
            
            if(arr[mid]==target)
            {
                return true;
            }
            else if(target>arr[mid])
            {
                left=mid+1;
            }
            else if(target<arr[mid])
            {
                right=mid-1;
            }
        }
        return false;
    }
}