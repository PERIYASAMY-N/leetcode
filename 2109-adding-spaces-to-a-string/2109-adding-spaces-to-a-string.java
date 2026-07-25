class Solution {
    public String addSpaces(String s, int[] spaces) 
    {
        StringBuilder sb=new StringBuilder();
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if (k < spaces.length && spaces[k] == i)
            {
                sb.append(" ");
                sb.append(c);
                k++;
            }
            else
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}