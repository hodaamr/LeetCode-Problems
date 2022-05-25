class Solution {
    fun strStr(haystack: String, needle: String): Int {
        
        if(needle.isEmpty()) return 0
        else if(haystack.contains(needle)) {
            return haystack.substringBefore(needle).length
        } else return -1
     
        /*var i: Int = 0
        var j: Int = 0
        
        
        if (haystack.length == 1 || needle.length == 0) {
            return  0
        }
        
        else if (needle in haystack){
            
            while (i < haystack.length && j < needle.length){
               
                if (haystack[i] == needle[j]){
                    break
                    
                }
                else {
                    i++
                }
                
            }
            return i        
        }
        else {
             return -1
         }*/
        
    }
}