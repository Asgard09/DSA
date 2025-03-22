import java.util.HashMap;
import java.util.Map;

public class HashMapJava {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,2};
        Map<Integer, Integer> myMap = new HashMap<>();
        //key: Gia tri cua phan tu trong mang
        //value: So lan xuat hien cua phan tu 
    
        for(int i : arr){
            if (myMap.containsKey(i) == false) {
                //i chua xuat hien trong myMap
                myMap.put(i, 1);        
            }else{
                //i da xuat hien trong myMap
                int count = myMap.get(i);
                count++;
                myMap.put(i, count);
            }
        }

        for(Map.Entry<Integer, Integer> entry : myMap.entrySet()){
            System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
        }

        HashMap<Integer, Integer> numMap = new HashMap<>();

        numMap.put(1, 1);
        numMap.put(2, 2);
        numMap.put(3, 3);
        numMap.put(4, 3);
        numMap.put(4, 4);
        System.out.println(numMap.values());
    }
}
