class Solution {
    public int minLength(String s) {
           Stack<Character> stack = new Stack<>();
           for(int i = 0;i<s.length();i++){
                char ch = s.charAt(i);
                if(!stack.isEmpty()){
                     if(ch == 'B' && stack.peek() == 'A'){
                            stack.pop();
                     }
                     else if(ch == 'D' && stack.peek() == 'C') {
                            stack.pop();
                     }
                     else stack.push(ch);
                }
                else stack.push(ch);
           }
           System.out.println(stack);
           return stack.size();
    }
}