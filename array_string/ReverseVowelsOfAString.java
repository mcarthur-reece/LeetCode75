public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
            char[] c = s.toCharArray();
            String vowels = "AEIOUaeiou";
            int starter = 0;
            int ender = s.length() - 1;

            while(starter < ender){

                while(starter < ender && vowels.indexOf(c[starter]) == -1){
                    starter++;
                }
                while(starter < ender && vowels.indexOf(c[ender]) == -1){
                    ender--;
                }
                char ch = c[starter];
                c[starter] = c[ender];
                c[ender] = ch;
                starter++;
                ender--;

            }
            return new String(c);
        }
    }