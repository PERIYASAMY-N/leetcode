class Solution {
    public String sortVowels(String s) 
    {
        // StringBuilder sb1=new StringBuilder();
        // StringBuilder sb2=new StringBuilder();
        List<Character> l1=new ArrayList<>();
        // List<Character> l2=new ArrayList<>();
        for(char c:s.toCharArray())
        {
            if(c=='a'||c=='e'||c=='o'||c=='i'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                l1.add(c);
            }
        }
        Collections.sort(l1);
        StringBuilder sb2=new StringBuilder();
        int k=0;
        for(char c:s.toCharArray())
        {
            if(c=='a'||c=='e'||c=='o'||c=='i'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                sb2.append(l1.get(k));
                k++;
            }
            else
            {
                sb2.append(c);
            }
        }
        return sb2.toString();
    }
}