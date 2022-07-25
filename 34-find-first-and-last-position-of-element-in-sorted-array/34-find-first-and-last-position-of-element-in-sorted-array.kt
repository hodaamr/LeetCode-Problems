class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        
        
        if (nums.isEmpty()){
           return intArrayOf(-1, -1)
            
        }
        else {
           return intArrayOf(nums.indexOfFirst{it == target}, 
                             nums.indexOfLast{it == target})
        }
        
    }
}