import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * The key of hashmap will be the count of letters of each group
 */
public class _49_Group_Anagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> strMap = new HashMap<>();
        

        for(String str: strs){
            int[] count = new int[26];
            for(char s : str.toCharArray()){
                count[s - 'a']++;        
            }

            StringBuilder bd = new StringBuilder();
            for(int num: count ){
                bd.append(num).append("#");
            }

            if(!strMap.containsKey(bd.toString())){
                strMap.put(bd.toString(), new ArrayList<>());
            }

            strMap.get(bd.toString()).add(str);
        }

        return new ArrayList<>(strMap.values());
    }

    public static void main(String[] args) {
        String[] inputs = {"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(inputs);
    }
}

