class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        
        var result : IntArray = intArrayOf(0,0)
        var j = 0
        
        for (i in 0..nums.size-1){
            j = i+1
            while (j < nums.size){
                if ((nums[i] + nums[j]) == target ){
                    result[0] = i
                    result[1] = j
                    break
                } 
                else {
                    j++
                }
            }
            
        }
        
        return result
    }
}