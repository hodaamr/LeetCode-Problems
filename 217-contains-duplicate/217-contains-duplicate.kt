class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        
        // Solution idea: 
        // 1. Sort given array -> nums
        // 2. Compare two adjacent elements
        // 3. if they are equal, return true
        // 4. else return false
        
        var i = 0
        
        nums.sort() 
        
        while (i < nums.size-1) {
            
            if (nums[i] == nums[i+1]) return true
            
            i++ 
        
        }
        
     return false   
    }
}