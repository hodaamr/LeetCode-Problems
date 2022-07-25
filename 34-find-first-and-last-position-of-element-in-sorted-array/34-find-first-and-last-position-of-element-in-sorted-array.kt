class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        
        val result: IntArray = intArrayOf(0 , 0)
        
        if (nums.isEmpty()){
           return intArrayOf(-1, -1)
            
        }
        else {
           return intArrayOf(nums.indexOfFirst{it == target}, 
                             nums.indexOfLast{it == target})
        }
        
       
        
        
      
    }
}