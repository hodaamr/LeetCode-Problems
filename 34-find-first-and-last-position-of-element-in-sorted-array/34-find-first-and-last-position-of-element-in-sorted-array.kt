class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        
        val result: IntArray = intArrayOf(0 , 0)
        
        if (nums.isEmpty()){
            result[0] = -1
            result[1] = -1
            
        }
        
        result[0] = nums.indexOfFirst{it == target}
        result[1] = nums.indexOfLast{it == target}
        
        /*if (nums.isEmpty()){
            result[0] = -1
            result[1] = -1
            
        }
        
        for ((index, value) in nums.withIndex()){
            if (value == target && nums[index+1] == target){
                result[0] = index
                result[1] = index + 1
                break
            }
            else {
                result[0] = -1
                result[1] = -1
            }
        
        }*/
        
        return result
    }
}