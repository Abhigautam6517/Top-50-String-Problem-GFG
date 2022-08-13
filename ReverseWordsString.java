
vaishnavinale880
1 week ago

JAVA Solution Using Stack

 

class Solution 
{
   //Function to reverse words in a given string.
   String reverseWords(String S)
   {
       // code here 
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