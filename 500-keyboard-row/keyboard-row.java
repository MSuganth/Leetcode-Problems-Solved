class Solution {
    public String[] findWords(String[] a) {
        Set<Character> s1 = Set.of('q','w','e','r','t','y','u','i','o','p');
        Set<Character> s2 = Set.of('a','s','d','f','g','h','j','k','l');
        Set<Character> s3 = Set.of('z','x','c','v','b','n','m');
        List<String> ans = new ArrayList<>();
        for(int i = 0;i<a.length;i++){
            String t = a[i];
            a[i] = a[i].toLowerCase();
            boolean r1 = true;
            boolean r2 = true;
            boolean r3 = true;
            if(s1.contains(a[i].charAt(0))){
                for(int j = 0;j<a[i].length();j++){
                    if(!s1.contains(a[i].charAt(j))){
                        r1 = false;
                        break;
                    }
                }
                if(r1) ans.add(t);
            }
            else if(s2.contains(a[i].charAt(0))){
                for(int j = 0;j<a[i].length();j++){
                    if(!s2.contains(a[i].charAt(j))){
                        r2 = false;
                        break;
                    }
                }
                if(r2) ans.add(t);
            }
            else{
                for(int j = 0;j<a[i].length();j++){
                    if(!s3.contains(a[i].charAt(j))){
                        r3 = false;
                        break;
                    }
                }
                if(r3) ans.add(t);
            }
        }
        String[] res = new String[ans.size()];
        for(int i = 0;i<ans.size();i++) res[i] = ans.get(i);
        return res;
    }
}