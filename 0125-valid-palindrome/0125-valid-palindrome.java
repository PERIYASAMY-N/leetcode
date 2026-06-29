class Solution {
    public boolean isPalindrome(String s) 
    {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray())
        {
             if(Character.isLetterOrDigit(c))
             {
                sb.append(c);
             }
        }
         String k=sb.toString().toLowerCase();
         String p=sb.reverse().toString().toLowerCase();
         System.out.print(p);
         return k.equals(p);
        //  int l=0;int r=k.length()-1;
        //  while(l<r)
        //  { 
        //     if(k.charAt(l)!=k.charAt(r)) 
        //     {
        //         return false;
        //     }
        //      l++;
        //      r--;
        //  }
        // return true;
    }
}