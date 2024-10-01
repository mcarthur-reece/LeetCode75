public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {
        String newWord = "";
        int i = 0;
        //iterate through the length of each string
        while(i < word1.length() || i < word2.length()){
            
            //appending to the new word
            if(i < word1.length()){
                newWord += word1.charAt(i);
            }
            //same but for the second
            if(i < word2.length()){
                newWord += word2.charAt(i);
            }

            i++;

        }

        return newWord;  
    }
    
}
