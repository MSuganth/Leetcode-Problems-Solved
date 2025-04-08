class Solution {
    public boolean strongPasswordCheckerII(String p) {
           if(p.length() < 8) return false;
           String ch = "!@#$%^&*()-+";
           boolean up = false;
           boolean low = false;
           boolean digit = false;
           boolean sp = false;
           for(int i = 0;i<p.length();i++){
              if(i == 0) if(p.charAt(i) == p.charAt(i+1)) return false;
              if(i == p.length()-1) if(p.charAt(i) == p.charAt(i-1)) return false;
              if(i != 0 && i != p.length()-1) if(p.charAt(i) == p.charAt(i+1)) return false;
              int t = (int) p.charAt(i);
              if(t >= 48 && t <= 57) digit = true;
              if(t >= 65 && t <= 90) up = true;
              if(t >= 97 && t <= 122) low = true;
              String st = p.charAt(i)+"";
              if(ch.contains(st)) sp = true;
           }
           if(up && low && digit && sp) return true;
           return false;
    } 
}