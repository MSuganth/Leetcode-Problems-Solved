class Solution {
    public String removeDuplicates(String s) {
          Stack<Character> stack = new Stack<>();
          for(int i = 0;i<s.length();i++){
              char ch = s.charAt(i);
              if(stack.isEmpty()) stack.push(ch);
              else if(stack.peek() == ch) stack.pop();
              else stack.push(ch);
          }
          String r = "";
          while(!stack.isEmpty()){
              r += stack.peek();
              stack.pop();
          }
          String res = "";
          for(int i = r.length()-1;i>=0;i--) res += r.charAt(i);
          return res;
    }
}