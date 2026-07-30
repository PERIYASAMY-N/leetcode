class Solution {
    public List<String> printVertically(String s) 
    {
        String arr[]=s.split(" ");
        List<String> fin=new ArrayList<>();
        int max=0;
        for(String K : arr)
        {
            if(K.length()>max)
            {
                max=K.length();
            }
        }
        for(int i=0;i<max;i++)
        {
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<arr.length;j++)
            {
                if(i<arr[j].length())
                {
                    sb.append(arr[j].charAt(i));
                }
                else
                {
                    sb.append(" ");
                } 
            }
            fin.add(sb.toString().stripTrailing());
   
    }
     return fin;
}
}