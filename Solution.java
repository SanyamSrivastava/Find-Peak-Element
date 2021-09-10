import java.util.*;

class Solution{
    
    static int findPeakElement(int[] nums) {
        int lo = 0, hi = nums.length-1;
        if(nums.length==1) //If single element then return the 0 index
            return 0;
        if(nums[1] < nums[0]) //If leftmost element is peak
            return 0;
        if(nums[nums.length-1] > nums[nums.length-2]) //If rightmost element is peak
            return nums.length-1;
        while(lo < hi){
            int mid = lo + (hi - lo)/2; //Prevention of INTEGER_OVERFLOW
            if( (mid == 0 || nums[mid-1] <= nums[mid]) && (mid == nums.length-1 || nums[mid+1] <= nums[mid]))
                return mid;
            else{
                if(nums[mid] <= nums[mid+1])
                    lo += 1;
                else
                    hi -= 1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0 ; i<n ; i++)
            ar[i] = sc.nextInt();
        
        System.out.print(findPeakElement(ar));
    }
}
