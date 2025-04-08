class Solution {
    public List<String> cellsInRange(String s) {
           int n1 = s.charAt(1) - '0';
           int n2 = s.charAt(4) - '0';
           char ch1 = s.charAt(0);
           char ch2 = s.charAt(3);
           int n = (n1>n2) ? n1 : n2;
           List<String> arr = new ArrayList<>();
           for(char i = ch1;i<=ch2;i++){
            //   System.out.println(i);
            //   System.out.println("--------");
              for(int j = n1;j<=n;j++){
                  String t = i+""+j;
                  arr.add(t);
              }
           }
           return arr;
    }
}