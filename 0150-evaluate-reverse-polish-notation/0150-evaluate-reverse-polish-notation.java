class Solution {
    public int evalRPN(String[] arr) {
        Stack<Integer> stack= new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            String str=arr[i];

                   
            if(str.equals("+")||str.equals("-")||
            str.equals("/")||str.equals("*"))
            {
                  int b=stack.pop();
                   int a=stack.pop();
                   int result=0;
                
                if(str.equals("+"))
                {
                   result=a+b;
                  
                }
                else if(str.equals("-"))
                {
                   result=a-b;
                   
                }
                else if(str.equals("/"))
                {
                   result=a/b;
                   
                }
                else if(str.equals("*"))
                {
                   result=a*b;
                   
                }
                stack.push(result);
            }
            else
            {
                int num=Integer.parseInt(str);
                stack.push(num);
            }
        }
        return stack.pop();
    }
}