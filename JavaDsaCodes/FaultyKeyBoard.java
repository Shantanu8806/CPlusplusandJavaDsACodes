class Solution {
    public String finalString(String s) {
        StringBuilder res = new StringBuilder();
        for(int j=0;j<s.length();j++)
            if(s.charAt(j)!= 'i')
                res.append(s.charAt(j));
            else
                res.reverse();
      return String.valueOf(res);
    }
}
