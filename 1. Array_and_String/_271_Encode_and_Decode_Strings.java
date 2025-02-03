import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _271_Encode_and_Decode_Strings {
    public static String encode(List<String> strs) {
        String res = "";
        for (String str : strs) {
            res += str.length() + "#" + str;
        }

        return res;
    }

    public static List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int i = 0;
        
        while (i<str.length()) {
            int j = i;
            //find "#"
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            //Remove past #
            i = j + 1;
            strs.add(str.substring(i, i + length));
            i += length;
        }
        return strs;
    }

    public static void main(String[] args) {
        List<String> strs = Arrays.asList("neet","code","love","you");
        System.out.println(encode(strs));

        
        System.out.println(decode(encode(strs)).toString());
    }
}
