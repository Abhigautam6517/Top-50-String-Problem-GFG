public class SumOfTwoLrgeNumber {

        String findSum(String X, String Y) {
            // code here
            // int n1 = Integer.parseInt(X);
            // int n2 = Integer.parseInt(Y);
            // int c = n1+n2;
            
            
            
            java.math.BigInteger n1=new java.math.BigInteger(X);
           java.math.BigInteger n2=new java.math.BigInteger(Y);
    
           java.math.BigInteger c = n1.add(n2);
            String s=String.valueOf(c);
            return s;
        }
    }
    

