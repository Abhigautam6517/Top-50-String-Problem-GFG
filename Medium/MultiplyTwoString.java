public class MultiplyTwoString {
    public String multiplyStrings(String s1,String s2)
    {
        //code here.
        java.math.BigInteger n1=new java.math.BigInteger(s1);
      java.math.BigInteger n2=new java.math.BigInteger(s2);
      java.math.BigInteger mult= n1.multiply(n2); 
    
    // int n1 = Integer.parseInt(s1);
    //  int n2 = Integer.parseInt(s2);
    //  int mult = n1*2
    // //   String s=Integer.toString(i);
    return mult.toString();
    }
    
    
}
