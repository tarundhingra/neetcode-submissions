class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //        if(nums[i]==nums[i+1]){
        //         return true;
        //        }
        // }
        // return false;
        Set<Integer> tarun = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(tarun.contains(nums[i])){
                return true;
            }
            tarun.add(nums[i]);
        }
    return false;
    }
}