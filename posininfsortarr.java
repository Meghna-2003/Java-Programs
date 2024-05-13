public class posininfsortarr {
    public static void main(String[] args) {
        int[] nums={1,3,6,7,32,44,56,78,98,123,234,456,678};
        int target = 44;
        int z= position(nums,target);
        System.out.println(z);
        
    }
    static int position(int[] nums,int target)
    {
        int start =0;
        int end =1;
        while(target> nums[end])
        {
            int newstart;
            newstart = end +1;
            end = end + ((end-start+1)*2);
            start = newstart;
        }
        return binarysearch(nums,target,start,end);
    }
    static int binarysearch(int[] nums,int target,int start,int end)
    {
        int mid;
        while(start<=end)
        {
            mid = start+((end-start)/2);
            if(target>nums[mid])
            {
                start=mid+1;
            }
            else if(target<nums[mid])
            {
                end=mid-1;
            }
            else
            {
                return mid;
            }

        }
        return -1;
    }
}
