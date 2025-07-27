class Solution {
    public int minAddToMakeValid(String s) {
        
        if(s.length()==0)
        {
            return 0;
        }
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                stack.push(ch);
            }
            else
            {
                if(stack.isEmpty()|| stack.peek()!='(')
                {
                    stack.push(ch);
                }
                else
                {
                    stack.pop();
                }
            }
        }
        int ans=stack.size();
        return ans;
    }
}