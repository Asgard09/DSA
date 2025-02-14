import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class _981_Time_Based_Key_Value_Store {
    public class Pair{
        int timeStamp;
        String val;
        public Pair(int timeStamp, String val) {
            this.timeStamp = timeStamp;
            this.val = val;
        }
        public int getTimeStamp() {
            return timeStamp;
        }
        public String getVal() {
            return val;
        }  

        
    }

    class TimeMap{
        HashMap<String, ArrayList<Pair>> myMap;

        public TimeMap() {
            myMap = new HashMap<>();
            
        }
        
        public void set(String key, String value, int timestamp) {
            if (myMap.containsKey(key)) {
                myMap.get(key).add(new Pair(timestamp, value));
            }else{
                ArrayList<Pair> list = new ArrayList<>();
                list.add(new Pair(timestamp, value));
                myMap.put(key, list);
            }
        }
        
        public String get(String key, int timestamp) {
            String res = "";

            //Avoid null
            if (myMap.containsKey(key)) {
                int left = 0;
                ArrayList<Pair> list = myMap.get(key);
                int right = myMap.get(key).size()-1;
                int mid = 0;
                while (left<=right) {
                    mid = (right+left)/2;
                    int timeVal = list.get(mid).getTimeStamp();
                    if ( timeVal == timestamp) {
                        return list.get(mid).getVal();
                    }else if(timeVal < timestamp){
                        res = list.get(left).getVal();
                        left = mid + 1;
                    }else{
                        right = mid - 1;
                    }
                }
            }

            return res;
        }
    }
}
