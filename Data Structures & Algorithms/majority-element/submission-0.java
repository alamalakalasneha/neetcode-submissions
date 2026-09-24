class Solution {
    public int majorityElement(int[] nums) {
        int threshold = nums.length/2;
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        for(int value : nums) {
            int updatedFrequencies = frequencies.getOrDefault(value, 0) + 1;
            frequencies.put(value, updatedFrequencies);
            if(updatedFrequencies > threshold) {
                return value;
            }
        }
        return -1;
    }
}