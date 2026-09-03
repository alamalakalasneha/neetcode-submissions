class Solution {
    public int[] twoSum(int[] nums, int target) {
        //create a hashmap for integers and indices
        HashMap<Integer, Integer> map = new HashMap<>();

        //iterate through the array of all the elements
        for(int i=0; i<nums.length; i++) {
            int complement = target - nums[i];

            //check if complement is present in the map
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement),i};
            }

            //else add the current element to its index
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
