import java.util.Stack;

class Solution 
{
   
   String reverseWords(String S)
   {

        S+=".";
        Stack<String> st=new Stack<String>();
        String rev="";
        for(int i=0;i<S.length();i++)
        {
           if(S.charAt(i)=='.')
           {
               st.push(rev);
               rev="";
           }
           else
           {
               rev+=S.charAt(i);
           }
        }
        
        String words="";
        while(st.size()!=1)
        {
            words+=st.peek()+".";
            st.pop();
           
        }
        words+=st.peek();
        
       return words;
       
   }
}