package Medium;
public class Atoi {
    static int atoi(String str) {
     int K;
     try{
         K=Integer.parseInt(str);
     }
     catch(Exception e){
         return -1;
     }
     return K;
    }
}
    

