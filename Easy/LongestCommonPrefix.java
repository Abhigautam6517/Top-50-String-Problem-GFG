public class LongestCommonPrefix {
    String longestCommonPrefix(String arr[], int n){
        String ans = "";
        for(int i = 0;i<arr[0].length();i++){
            char t = arr[0][i];
            for(int j = 1;j<n;j++){
                if(t!=arr[j][i]){
                    return ans;
                }
                ans = ans+t;
            }
        }
        return ans;
       
      
    }
    
}
