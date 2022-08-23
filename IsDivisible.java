// import java.math.BigInteger;

class isdivisible{
    static int isdivisible7(String num){
       
       int number = Integer.parseInt(num);
       if(number%7==0){
        return 1;
       }       
       else{
        return 0;
       }
    //   BigInteger number = new BigInteger(num);
    //   int div = number.divide(7);
    //   if(div==0){
    //     return 1;
    //   }
    //   else{
    //     return 0;
    //   }
   }
   public static void main(String[] args) {
    String num = "8458855255595581";
    System.out.println(isdivisible7(num));
    
   }
}