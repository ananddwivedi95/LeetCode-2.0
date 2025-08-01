class Solution {
    public int[] nextGreaterElements(int[] nums) {
    
      Stack<Integer> stack= new Stack<>();
      int[] result= new int[nums.length];
      int[] duplicate= new int[nums.length*2];
      int index=0;
      for(int i=0;i<nums.length;i++)
      {
        duplicate[index++]=nums[i];
      }

      for(int i=0;i<nums.length;i++)
      {
        duplicate[index++]=nums[i];
      }  

      for(int i=duplicate.length-1;i>=0;i--)
      {
         while(!stack.isEmpty()&&duplicate[i]>=stack.peek())
         {
              stack.pop();
         }
         if(i<=nums.length-1)
         {
            if(stack.isEmpty())
            {
                result[i]=-1;
            }
            else
            {
                result[i]=stack.peek();
            }
         }
         stack.push(duplicate[i]);
      }
      return result;
    }
}