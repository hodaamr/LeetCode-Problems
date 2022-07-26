class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var l = m
        for (i in 0 until n) { 
            nums1[l] = nums2[i]
            l++
        }
        nums1.sort()
    }
}