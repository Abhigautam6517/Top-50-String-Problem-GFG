public class CountVowels {
    public static int getvowelCount(String word,int count){
        int n = word.length();
        for(int i = 0;i<n;i++){
            char firstWord = word.charAt(i);
            switch(firstWord){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'O':
                case 'I':
                case 'U':
                    count+=1;
                    break;
                
            }



        }
        return count;
    }
    public static void main(String[] args) {
        String word = "Onion is The best";
        int count= 0;
        int result  = getvowelCount(word, count);
        System.out.println(result);
    }
    
}
