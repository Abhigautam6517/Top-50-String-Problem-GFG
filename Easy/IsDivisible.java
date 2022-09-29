// import java.math.BigInteger;

class isdivisible{
   //  static int isdivisible7(String num){
       
   //     int number = Integer.parseInt(num);
   //     if(number%7==0){
   //      return 1;
   //     }       
   //     else{
   //      return 0;
   //     }

   static int isdivisible7(String num){
        
      int rem=0;
      for(int i=0;i<num.length();i++)
      {
          rem=((rem*10)+(num.charAt(i)-'0'))%7;
      }
      return rem==0?1:0;
      
   }
 
   public static void main(String[] args) {
    String num = "210000056555";
    System.out.println(isdivisible7(num));
    
   }
}