class Solution 
{
    public int binaryGap(int n) 
    {
        int maxgap = 0;
        int lastpos = -1;

        String s = Integer.toBinaryString(n);

        for (int i = 0; i < s.length(); i++) 
        {
            if (s.charAt(i) == '1') 
            {
                if (lastpos != -1) 
                {
                    int gap = i - lastpos;
                    maxgap = Math.max(maxgap, gap);
                }

                lastpos = i;
            }
        }

        return maxgap;
    }
}
