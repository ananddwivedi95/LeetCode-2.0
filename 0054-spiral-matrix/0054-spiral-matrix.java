class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
     int m=mat.length;
        int n=mat[0].length;
        
        int top=0;
        int down=m-1;
        int left=0;
        int right=n-1;
        
        /*dir=0 -> left to right 
        dir=1 -> top to down
        dir=2 -> right to left
        dir=3 -> down to top*/
        
        ArrayList<Integer> result= new ArrayList<>();
        int dir=0;
        while(top<=down && left<=right)
        {
            if(dir==0)
            {
                // left -> right
                
                for(int i=left;i<=right;i++)
                {
                    result.add(mat[top][i]);
                }
                top++;
            }
            
            if(dir==1)
            {
                //top -> down
                for(int i=top;i<=down;i++)
                {
                    result.add(mat[i][right]);
                }
                right--;
            }
            if(dir==2)
            {
                // right->left
                for(int i=right;i>=left;i--)
                {
                    result.add(mat[down][i]);
                }
                
                down--;
            }
            if(dir==3)
            {
                //down -> top
                
                for(int i=down;i>=top;i--)
                {
                    result.add(mat[i][left]);
                }
                left++;
            }
            
            dir++;
            if(dir>3)
            {
                dir=0;
            }
        }
        return result;

    }
}