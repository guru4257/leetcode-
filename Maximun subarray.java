class Solution {
    public int maxSubArray(int[] nums) {
        
        int count=0;
        int sum=nums[0];
        for(int i=0;i<nums.length;i++){
            count+=nums[i];
            if(count>sum){
                sum=count;
            }
            if(count<0)count=0;
        }
        return sum;
    }
}
