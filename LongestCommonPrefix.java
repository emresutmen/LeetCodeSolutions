class Solution {
    public String longestCommonPrefix(String[] strs) {
    int n = strs.length;
       // take temp_prefix string and assign first element of strs : a.
       String result = strs[0];
       
       // Iterate for rest of element in string.
       for(int i = 1; i < n; i++){
            // .indexOf() return index of that substring from string.
            while(strs[i].indexOf(result) != 0){
               
                // update matched substring prefx
                result = result.substring(0, result.length()-1);
               
                // check for empty case. direct return if true..
                if(result.isEmpty()){
                    return "";
                }
            }
        }
        return result;
    }
 
}
