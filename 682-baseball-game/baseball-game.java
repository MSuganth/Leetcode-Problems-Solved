class Solution {
    public int calPoints(String[] op) {
           Stack<Integer> stack = new Stack<>();
           for(String i : op){
               if(i.equals("C")){
                  stack.pop();
               }
               else if(i.equals("D")){
                   int t = stack.peek()*2;
                   stack.push(t);
               }
               else if(i.equals("+")){
                    int t1 = stack.peek();
                    stack.pop();
                    int t2 = stack.peek();
                    stack.push(t1);
                    stack.push(t1+t2);
               }
               else{
                   int t = Integer.valueOf(i);
                   stack.push(t);
               }
           }
           int sum = 0;
           for(int i:stack) sum += i;
           return sum;
    }
}