//better solution using binary search

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;

        //iterate through the arrray
        for(int i=0; i<n-1; i++) {
            int complement = target - numbers[i];

            //initialize 2 pointers
            int low = i+1;
            int high = n-1;
            
            while(low <= high) {
                int mid = low + (high-low) / 2;
                //condition 1: if mid number == complement then return the indices
                if(numbers[mid] == complement) {
                    return new int[] {i+1, mid+1};
                } else if(numbers[mid] < complement) {
                    low = mid+1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return new int[]{-1,-1};
    }
}




