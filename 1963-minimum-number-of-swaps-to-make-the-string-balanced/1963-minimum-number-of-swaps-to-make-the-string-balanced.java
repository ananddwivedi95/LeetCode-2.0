class Solution {
    public int minSwaps(String s) {
        
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='[')
            {
                stack.push(ch);

            }
            else
            {
                if(stack.isEmpty() || stack.peek()==']')
                {
                    stack.push(ch);
                }
                else
                {
                    stack.pop();
                }
            }
        }
          
          int totalParenthasis=stack.size();
          int closedParanthesis=totalParenthasis/2;
     return (closedParanthesis+1)/2;
    }
}