class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>=nums.length/3){
                set.add(nums[i]);
            }
        }
        List<Integer> li = new ArrayList<>();
        for(int i:set){
            li.add(i);
        }

        return li;
    }
}
