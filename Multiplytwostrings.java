public class Multiplytwostrings {
    public static String multiply(String s1,String s2)
    {

        int mult = 1;
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        mult = n1*n2;
        String str=String.valueOf(mult);
        
        return str;
    }
    public static void main(String[] args) {
        String str1 = "235";
        String str2 = "435";
       
        multiply(str1,str2);
    }
    
}
