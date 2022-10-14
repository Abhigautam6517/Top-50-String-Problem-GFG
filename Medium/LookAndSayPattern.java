public class LookAndSayPattern {
    static String lookandsay(int n) {
        if(n==1) return "1";
        
        String s=lookandsay(n-1);
        StringBuilder ans=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++)
        {   count++; 
            if(i==s.length()-1  || s.charAt(i)!=s.charAt(i+1))
            {
              ans.append(count).append(s.charAt(i));
                count=0;
            }
           
        }
        return ans.toString();
    }

    
}
