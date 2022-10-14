public class AddBinaryString {
    String addBinary(String A, String B) {
        java.math.BigInteger n1=new java.math.BigInteger(A,2);
        java.math.BigInteger n2=new java.math.BigInteger(B,2);
        n1=n1.add(n2);
        return n1.toString(2);
    }
 
    
}
