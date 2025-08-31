class Solution {
    public void rotate(int[][] arr) {
        
        //transpose
        int n=arr.length;
        for(int i=0;i<n;i++)
        {   
            for(int j=0;j<n;j++)
            {   int temp=0;
                if(i!=j&&i<j)
                {
                  temp=arr[i][j];
                  arr[i][j]=arr[j][i];
                  arr[j][i]=temp;
                }
            }
        }
        //reverse in place
        for(int i=0;i<n;i++)
        {   
            int temp=0;
            for(int j=0;j<n/2;j++)
            {
                temp=arr[i][j];
                arr[i][j]=arr[i][(n-1)-j];
                arr[i][(n-1)-j]=temp;
            }
        }
    }
}