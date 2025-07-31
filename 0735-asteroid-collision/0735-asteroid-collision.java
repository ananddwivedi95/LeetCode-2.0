class Solution {
    public int[] asteroidCollision(int[] asteroids) {
      Stack<Integer> stack= new Stack<>();
      for(int i=0;i<asteroids.length;i++)
      {
            // blindely push if stack is empty or number is positive
            if(stack.isEmpty()||asteroids[i]>0)
            {
                stack.push(asteroids[i]);
            }
            else
            {    // if the number is negative 
                while(!stack.isEmpty())
                {
                  int top=stack.peek();

                  // if both top and number will be negative 
                  if(top<0)
                  {
                    stack.push(asteroids[i]);
                    break;
                  }
                  int absValue=Math.abs(asteroids[i]);
                  // if both value will be equal 
                  if(top==absValue)
                  {
                    stack.pop();
                    break;
                  }
                  else if(top>absValue)
                  {
                    break;
                  }
                  else if(top<absValue)
                  {
                     stack.pop();
                     if(stack.isEmpty())
                     {
                        stack.push(asteroids[i]);
                        break;
                     }
                  }
                  
                 
                }
            
            }
       }
       int[] result=new int[stack.size()];
       for(int i=result.length-1;i>=0;i--)
       {
        result[i]=stack.pop();
       }
       return result;  
    }
}