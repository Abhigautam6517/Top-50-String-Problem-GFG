package Medium;

public class ValidateIPAdress {
     
 public boolean isValid(String s) {
    if(s.endsWith(".")){
        return false;
    }
    String arr[] = s.split("\\.");
    if(arr.length!=4)
        return false;
    for(int i=0;i<arr.length;i++){
        //System.out.println(arr[i]);
         if(arr[i].length()>1 && arr[i].startsWith("0")){
            return false;            
            }
        if(arr[i].equals("")){
            return false;  
        }
        if(!arr[i].matches("\\d+"))
            return false;
        Integer num = Integer.valueOf(arr[i]);
        if(num<0 || num>255){
            return false;
        }
    }
    return true;
}
    
}
