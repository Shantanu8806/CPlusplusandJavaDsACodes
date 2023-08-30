class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        StringBuffer get=new StringBuffer(str);
        get.reverse();
        String ans=get.toString();
        return ans;
    }
}
