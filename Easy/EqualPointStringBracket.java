public class EqualPointStringBracket {
    static long alphabet(String str){
        int close = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)==')'){
                close++;
            }
        }
        return close;
    }
    public static void main(String[] args) {
        String bracket = "(())))(";
        
       System.out.println(alphabet(bracket));
    }
    
}
