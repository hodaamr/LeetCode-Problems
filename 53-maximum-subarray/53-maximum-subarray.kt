class Solution {
    fun maxSubArray(nums: IntArray): Int {
        
        var max = Int.MIN_VALUE
        var current = 0
        nums.forEach {
            current = maxOf(current + it, it)
            max = maxOf(max, current)
        }

        return max
    }
}