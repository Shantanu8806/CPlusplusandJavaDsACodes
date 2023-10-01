class Solution {
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(String str:strings)
            result.append(new StringBuilder(str).reverse()).append(" ");
      return result.toString().trim();
    }
}
