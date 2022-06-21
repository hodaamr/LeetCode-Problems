class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        
        var i = 0
        
        nums.sort()
        
        while (i < nums.size-1) {
            
            if (nums[i] == nums[i+1]) return true
            
            i++ 
        
        }
        
     return false   
    }
}