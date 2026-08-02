class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {

        List<Integer>l=new ArrayList<>();
        if (p.length() > s.length()) {
                 return new ArrayList<>();
        }
        int sc[]=new int[26];
        int pc[]=new int[26];
        for(int i=0;i<p.length();i++)
        {
            sc[s.charAt(i)-'a']++;
            pc[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(sc,pc))
        {
            l.add(0);
        }
        for(int i=p.length();i<s.length();i++)
        {
            sc[s.charAt(i) - 'a']++;
             sc[s.charAt(i - p.length()) - 'a']--;
               if(Arrays.equals(sc,pc))
             {
                l.add(i - p.length() + 1);
             }
        }

        return l;
        
    }
}