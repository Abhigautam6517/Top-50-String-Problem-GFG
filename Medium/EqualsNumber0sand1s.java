import java.util.HashMap;
import java.util.Map;

class EqualsNumber0sand1s
{ 
    long getSubstringWithEqual012(String str) 
    { 
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        String key = (c1 - c0)+"*"+(c2 - c1);
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put(key, 1);
        for (char c : str.toCharArray()) {
            if (c == '0') {
                c0++;
            } else if (c == '1') {
                c1++;
            } else {
                c2++;
            }
            key = (c1 - c0)+"*"+(c2 - c1);
            if (map.containsKey(key)) {
                count += map.get(key);
                map.put(key, map.get(key) + 1); // increase the occurance
            } else {
                map.put(key, 1);
            }
        }
        return count;
    }
}