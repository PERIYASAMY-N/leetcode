class Solution {
    public String processStr(String s) 
    {
        StringBuilder sb=new StringBuilder();
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(Character.isLetter(c[i]))
            {
                sb.append(c[i]);
            }
            else if(c[i]=='#')
            {
                sb.append(sb.toString());
            }
            else if(c[i]=='*')
            {
                if(sb.length()>0)
                {
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            else
            {
                sb.reverse();
            }
        }
        return sb.toString();
    }
}