class Solution {
    public int digitFrequencyScore(int n) 
    {
        Map<Integer,Integer>map=new HashMap<>();
        while(n!=0)
        {
            int dig=n%10;
            map.put(dig,map.getOrDefault(dig,0)+1);
            n/=10;
        }
        int sum=0;
        for(int p:map.keySet())
        {
            sum+=(p*map.get(p));
        }
        return sum;
    }
}