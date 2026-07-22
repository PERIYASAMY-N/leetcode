class Solution {
    public int calPoints(String[] operations) 
    {
        List<Integer> l=new ArrayList<>();
        for(String s:operations)
        { 
            if (s.equals("D")) {
                l.add(2 * l.get(l.size() - 1));
            }
            else if (s.equals("C")) {
                l.remove(l.size() - 1);
            }
            else if (s.equals("+")) {
                l.add(l.get(l.size() - 1) + l.get(l.size() - 2));
            }
            else {
                l.add(Integer.parseInt(s));
           
           }
        }
        int sum=0;
        for(int n:l)
        {
            sum+=n;
        }
        return sum;
    }
}