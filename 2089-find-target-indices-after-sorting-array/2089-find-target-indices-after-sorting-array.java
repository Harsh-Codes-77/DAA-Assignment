class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                ans.add(i);
            }
        }
        return ans;
    }
}