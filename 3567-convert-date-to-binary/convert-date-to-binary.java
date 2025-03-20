class Solution {
    public String convertDateToBinary(String d) {
          String s1 = d.substring(0,4);
          String s2 = d.substring(5,7);
          String s3 = d.substring(8,10);
          int y = Integer.parseInt(s1);
          int m = Integer.parseInt(s2);
          int day = Integer.parseInt(s3);
          String ty = "";
          String tm = "";
          String td = "";
          String year = "";
          String month =  "";
          String date = "";
          while(y>0){
                String t = String.valueOf(y%2);
                ty += t;
                y/=2;
          }
          for(int i = ty.length()-1;i>=0;i--){
             year += ty.charAt(i);
          }
          while(m>0){
                String t = String.valueOf(m%2);
                tm += t;
                m/=2;
          }
          for(int i = tm.length()-1;i>=0;i--){
             month += tm.charAt(i);
          }
          while(day>0){
                String t = String.valueOf(day%2);
                td += t;
                day/=2;
          }
          for(int i = td.length()-1;i>=0;i--){
             date += td.charAt(i);
          }
          String out = year+"-"+month+"-"+date;
          return out;
    }
}