public class AtoiClass {
    public static void main(String[] args) {
        System.out.println(myAtoi("91283472332"));
    }
    public static int myAtoi(String s) {
        int numSt = -1;
        char sym = ' ';
        String num = "";
        for(int i = 0; i< s.length();i++){
            if(s.charAt(i)>'0' && s.charAt(i)<='9'){
                num += s.charAt(i);
            }
            else if(s.charAt(i) == '+' || s.charAt(i) == '-'){
                if(num.length()>1){
                    break;
                }
                sym = s.charAt(i);
            }
            else if(s.charAt(i)> 'a' && s.charAt(i)<='z'){
                break;
            }
            else{
                if(num.length()>1){
                    break;
                }
                continue;
            }
        }
        int lowerLimit = (int) Math.pow(-2, 31);
        int upperLimit = (int) Math.pow(2, 31) - 1;
        if(num.length()>1){
            try {
                if (sym == '-') {

                    if (Integer.parseInt(num) < upperLimit || Integer.parseInt(num) > lowerLimit) {
                        return -Integer.parseInt(num);
                    } else return 0;
                } else {
                    if (Integer.parseInt(num) < upperLimit || Integer.parseInt(num) > lowerLimit) {
                        return Integer.parseInt(num);
                    } else return 0;
                }
            }
            catch (NumberFormatException e){
                return 0;
            }
        }
        else{
            return 0;
        }
    }
}
