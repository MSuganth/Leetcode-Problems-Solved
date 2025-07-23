class Solution {
    public int maximumGain(String s, int x, int y) {
           int maximum_score = 0;
           Stack<Character> stack = new Stack<>();
           if(x>y){
               int i = 0;
               while(i<s.length()){
                    char ch = s.charAt(i);
                    if(stack.isEmpty()) stack.push(ch);
                    else if(stack.peek() == 'a' && ch == 'b'){
                         maximum_score += x;
                         stack.pop();
                    }
                    else stack.push(ch);
                    i++;
               }
               StringBuilder str = new StringBuilder();
               for(char ch:stack) str.append(ch);
               stack.clear();
               i = 0;
               while(i<str.length()){
                    char ch = str.charAt(i);
                    if(stack.isEmpty()) stack.push(ch);
                    else if(stack.peek() == 'b' && ch == 'a'){
                         maximum_score += y;
                         stack.pop();
                    }
                    else stack.push(ch);
                    i++;
               }
               return maximum_score;
           }
           else if(y>=x){
                int i = 0;
                while(i<s.length()){
                    char ch = s.charAt(i);
                    if(stack.isEmpty()) stack.push(ch);
                    else if(stack.peek() == 'b' && ch == 'a'){
                         maximum_score += y;
                         stack.pop();
                    }
                    else stack.push(ch);
                    i++;
               }
               StringBuilder str = new StringBuilder();
               for(char ch:stack) str.append(ch);
               stack.clear();
               i = 0;
               while(i<str.length()){
                    char ch = str.charAt(i);
                    if(stack.isEmpty()) stack.push(ch);
                    else if(stack.peek() == 'a' && ch == 'b'){
                         maximum_score += x;
                         stack.pop();
                    }
                    else stack.push(ch);
                    i++;
               }
               return maximum_score;
           }
           return x;
    }
}