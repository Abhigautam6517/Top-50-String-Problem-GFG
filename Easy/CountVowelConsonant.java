public class CountVowelConsonant {
    public static int getvowelCount(String word,int count){
        int n = word.length();
        int count2 = 0;
        for(int i = 0;i<n;i++){
            char firstWord = word.charAt(i);
            if(firstWord=='a' || firstWord=='e' || firstWord=='i' || firstWord=='o' || firstWord=='u' || firstWord=='A' || firstWord=='E' || firstWord=='I' || firstWord=='O' || firstWord=='U'){
                count+=1;
            }
            else{
                count2+=1;
            }
           



        }
        System.out.println("Total Vowels are"+" "+count);
        System.out.println("Total consonant are"+" "+count2);
        return count;
    }
    public static void main(String[] args) {
        String word = "Onion is The best";
        int count= 0;
        getvowelCount(word, count);
       
    }
    
}
