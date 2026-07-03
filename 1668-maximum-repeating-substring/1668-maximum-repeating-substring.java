class Solution {
    public int maxRepeating(String sequence, String word) 
    {
        int count=0;
        // for(int i=0;i<=sequence.length()-word.length();i++)
        // {
        //     //System.out.println(sequence.substring(i,i+word.length()));
        //     if(word.equals(sequence.substring(i,i+word.length())))
        //     {
        //         count++;
        //     }
        // }
        String val=word;
        while(sequence.contains(val))
        {
            count++;
            val+=word;
        }
        return count;
    }
}