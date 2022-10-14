public class FindandReplace {
    static String findAndReplace(String s, int q, int[] index, String[] sources, String[] targets) {
        for(int i=q-1;i>=0;i--)
        {
            int t=index[i];
            String a1=s.substring(t,t+sources[i].length());
            if(a1.equals(sources[i]))
            {
                String l=s.substring(0,t);
                String r=s.substring(t+sources[i].length());
                s=l+targets[i]+r;
            }
        }
        return s;
    }
    
}
