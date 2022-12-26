class Solution {
    public int majorityElement(int[] nums) {
        int vote=1;
        int voter=nums[0];
        for(int i=1;i<nums.length;i++){
           if(vote==0){
               voter=nums[i];
               vote=1;
           }
           else{
               if(voter==nums[i]){
                   vote++;
               }
               else{
                   vote--;
               }
           }
        }
        return voter;
    }
}
