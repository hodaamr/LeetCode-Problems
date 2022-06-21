class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        
        var j = 0
        var duplicate: Boolean = false
        for (i in 0..nums.size-1) {
            j = i + 1
            while ((duplicate == false) && (j < nums.size)){
                if (nums[i] != nums[j]) {
                    j++
                }
                else {
                    duplicate = true
                    break
                }
            }
        
    }
     return duplicate   
    }
}