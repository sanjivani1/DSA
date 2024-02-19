import java.util.ArrayList;

public class FlipChar {
    public static void main(String[] args) {
        String st = "+++++";
        StringBuilder str = new StringBuilder(st);

        ArrayList<String> list = new ArrayList<>();
                list = doFlips(str);
        System.out.println(list);
    }

    private static ArrayList<String> doFlips(StringBuilder str) {

        ArrayList<String> result = new ArrayList<>();
        String res = "";
        if(str.length() == 0 || str.length()== 1)
            return result;
        for(int i =0 ; i< str.length()-1 ; i++){
            StringBuilder tempString = new StringBuilder(str);
            if(str.charAt(i) == '+' && str.charAt(i+1) == '+'){
                tempString.setCharAt(i, '-');
                tempString.setCharAt(i+1, '-');
            }
            result.add(tempString.toString());
        }
        return result;
    }
}
