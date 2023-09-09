class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(pattern.length()!= arr.length)
        {
            return false;
        }
        HashMap<Character,String> mp = new HashMap<Character,String>();

        for(int i=0;i<pattern.length();i++)
        {
            char ch=pattern.charAt(i);
            boolean containsKey=mp.containsKey(ch);
            if(mp.containsValue(arr[i]) && !containsKey)
            {
                return false;
            }
            if(containsKey && !mp.get(ch).equals(arr[i]))
            {
                return false;
            }
            else
            {
                mp.put(ch,arr[i]);
            }
            
        }
       return true;
    }
}
