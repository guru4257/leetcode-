class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack= new Stack<>();
        int[] arr=new int[n];
        for(int i=n*2-1;i>=0;i--){
            while(stack.isEmpty()==false && stack.peek()<=nums[i%n]){
                stack.pop();
            }
            if(i<n){
                if(stack.isEmpty()==false){
                    arr[i]=stack.peek();
                }
                else{
                    arr[i]=-1;
                }
            }
            stack.push(nums[i%n]);
        }

        return arr;
    }
}
