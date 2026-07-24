class Solution {
    public int reverseDegree(String s)
    {
       
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char l=s.charAt(i);
            int v='z'- l+1;
            sum+=v*(i+1);
        }
       return sum; 
    }
}