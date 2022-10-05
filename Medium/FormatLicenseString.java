package Medium;

public class FormatLicenseString {
    static String ReFormatString(String s, int k){
        // code here
          StringBuilder sb = new StringBuilder();
		
		//converting to uppercase and removing all "-"
        s = s.toUpperCase();
        s = s.replaceAll("-","");
        
		//count for keeping track of K elements
        for(int i = s.length()-1,count =0; i >=0 ; i--)
        {
		//append characters after k elements and reset the counter
            if(count == k){
                sb.append('-');
                count = 0;
            }
            sb.append(s.charAt(i));
            count++;
        }
		//reverse the resultant string 
        return sb.reverse().toString();
    
    }
    
}
