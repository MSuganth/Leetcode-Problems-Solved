class Solution {
    public boolean isValid(String s) {
           Stack<Character> arr = new Stack<>();
           for(int i = 0;i<s.length();i++){
              char ch = s.charAt(i);
              if(ch == '{'|| ch == '['|| ch == '(') arr.push(ch);
              else{
                 if(!arr.isEmpty()){
                    char top = arr.peek();
                    if(ch == '}' && top == '{') arr.pop();
                    else if(ch == ')' && top == '(') arr.pop();
                    else if(ch == ']' && top == '[') arr.pop();
                    else return false;
                 }
                 else arr.push(ch);
              }
           }
           if(arr.isEmpty()) return true;
           return false;
    }
}