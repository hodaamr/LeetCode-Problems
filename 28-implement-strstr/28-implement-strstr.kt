class Solution {
    fun strStr(haystack: String, needle: String): Int {
        
        if(needle.isEmpty()) return 0
        
        for ((index, char) in haystack.withIndex()){
            return if (char == needle[0]){
                if(haystack.length >= index + needle.length){
                    if(haystack.substring(index, index + needle.length) == needle){
                        index
                    } 
                    else{
                        continue
                        
                    }
                }
                else {
                    -1
                }
            }
            else{
                continue
            }
        }
        
        return -1
        
    }
}