class Solution {
    public boolean isValid(String s) {
        int top = -1;
        char[] stack = new char[s.length()];

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                stack[++top]=c;
            else{
                char peak = top == -1 ? '0' : stack[top--];

                if(c==')')
                    if(peak != '(') return false; 
                if(c=='}')
                    if(peak != '{') return false; 
                if(c==']')
                    if(peak != '[') return false;
                 
            }       
        }
        return top== -1;
    }
}