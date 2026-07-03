class Solution {
    public int maxDistinct(String s) 
    {
        Set<Character>b=new HashSet<>();
        for(char c:s.toCharArray())
        {
            b.add(c);
        }
        return b.size();
        
    }
}