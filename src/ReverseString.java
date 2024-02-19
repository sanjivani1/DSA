public class ReverseString {
    public static void main(String[] args) {

        ReverseString r = new ReverseString();
        System.out.println("String-> "+r.reverseWords("aaaaa "));
    }
    public static String reverseWords(String s) {
        String ans = "";
        String str = s.trim();
        int n = str.length();
        int l = -1;
        int r = n;
        for(int i= n-1; i>=0; i--){
            if(str.charAt(i)!=' '){
                l = i;
            }
            else if(str.charAt(i) == ' ' ){
                if(l != -1)
                    ans = ans + str.substring(l,r)+' ';
                l = -1;
                r = i;
            }
        }
        if(l != -1){
            ans = ans + str.substring(l,r);
        }

        return ans.trim();
    }
}
