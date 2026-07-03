class Solution {
   
    public String reverseWords(String s) 
    {
        String arr[]=s.split("\\s+");
        int ar[]=new int[arr.length];
        int ind=0;
       
        for(int i=0;i<arr.length;i++)
        {
             int count=0;
            for(char c:arr[i].toCharArray())
            {
                if(c=='a'||c=='o'||c=='i'||c=='e'||c=='u')
                {
                    count++;
                }
            }
            ar[ind]=count;
            ind++;
        }
    
        StringBuilder sb=new StringBuilder();
        sb.append(arr[0]);
        sb.append(" ");
        for(int i=1;i<arr.length;i++)
        {
            if(ar[i]==ar[0])
            {
                 StringBuilder p=new StringBuilder(arr[i]);
                 p.reverse();
                
                 sb.append(p.toString());
                 sb.append(" ");
            }
            else
            {
               sb.append(arr[i]);
                 sb.append(" "); 
            }
        }
        return sb.toString().trim();
    }
}