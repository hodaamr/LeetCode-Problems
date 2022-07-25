class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        
        val result: IntArray = intArrayOf(0 , 0)
        
        if (nums.isEmpty()){
            result[0] = -1
            result[1] = -1
            
        }
        
        result[0] = nums.indexOfFirst{it == target}
        result[1] = nums.indexOfLast{it == target}
        
        
        return result
    }
}