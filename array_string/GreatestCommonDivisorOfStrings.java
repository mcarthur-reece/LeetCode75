public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
            //intial check 
            if(!((str1 + str2).equals(str2 + str1))){
                return "";
            }

            int gcd = greatestCommonDivisor(str1.length(), str2.length());

            return str1.substring(0, gcd);

        }
        private int greatestCommonDivisor(int a, int b){
            //base case 
            if (b == 0){
                return a;
            } else {
                return greatestCommonDivisor(b, a % b);
            }
        }
    }