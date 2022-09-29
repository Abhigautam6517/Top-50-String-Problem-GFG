import java.util.ArrayList;

public class ClosetString {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        int count1 = 0;
        int count2 = 0;
        int mi=Integer.MAX_VALUE;

        for(int i = 0; i<s.size();i++){
            if(s.get(i).equals(word1)){
                count1=i;
            }
            if(s.get(i).equals(word2)){
                count2=i;
            }
            if(count1!=0 && count2!=0)
             mi=Math.min(mi,Math.abs(count1-count2));
           
        }
         return mi;
    }
    
}
