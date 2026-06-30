class Solution {
    public int compress(char[] chars) 
    {
        int i=0;
        int ret=0;
        while(i<chars.length)
        {
            char cur=chars[i];
            int count=0;
            while(i<chars.length&& chars[i]==cur)
            {
                count++;
                i++;
            }
            chars[ret++]=cur;
            if(count>1)
            {
                String s=String.valueOf(count);
                for(char c:s.toCharArray())
                {
                    chars[ret++]=c;
                }
            }
            

        }
        return ret;
    }
}