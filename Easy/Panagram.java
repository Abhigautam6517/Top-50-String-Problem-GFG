public class Panagram {
    public static boolean checkPangram  (String st) {

        // your code here

         int count=0;

        if (st.length() < 26) {

            return false;

        } else {

            char i='a',j='A';

            while (i < 'z' && j<'Z') {

                if (st.contains(String.valueOf(i)) ||st.contains(String.valueOf(j))){

                    j++;i++;

                }

                else{

                    count++;

                    j++;i++;

                }

            }

        }

        return count==0?true:false;

    }
    
}
