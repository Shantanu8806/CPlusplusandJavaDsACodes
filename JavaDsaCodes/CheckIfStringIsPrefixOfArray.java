class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder t = new StringBuilder();

        for(String word:words)
        {
            t.append(word);
            if(s.equals(t.toString()))
            {
                return true;
            }
        }
      return false;
    }
}
