class Solution 
{
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        int[] result = new int[nums1.length];
        int k = 0;   // added

        for(int i = 0; i < nums1.length; i++)
        {
            for(int j = 0; j < nums2.length; j++)
            {
                if (nums1[i] == nums2[j])
                {
                    // check duplicate (added)
                    boolean found = false;
                    for(int m = 0; m < k; m++)
                    {
                        if(result[m] == nums1[i])
                        {
                            found = true;
                            break;
                        }
                    }

                    if(!found)
                    {
                        result[k] = nums1[i]; // changed i → k
                        k++;
                    }
                } 
            }
        }

        int[] ans = new int[k];   // correct size

        for(int i = 0; i < k; i++)
        {
            ans[i] = result[i];
        }

        return ans;
    }
}
