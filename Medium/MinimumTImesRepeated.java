public class MinimumTImesRepeated {
        static int minRepeats(String A, String B) {
            int max = B.length()/A.length()+1;
            int min = 1;
            String rep = A;
            for(int i=0; i<=max; i++){
                if(A.contains(B)){
                    return min;
                }
                A = A + rep;
                min++;
            }
            return -1;
        }
     };
    
