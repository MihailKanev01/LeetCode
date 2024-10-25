package Easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> romanValue = new HashMap<Character, Integer>();

        romanValue.put('I', 1);
        romanValue.put('V', 5);
        romanValue.put('X', 10);
        romanValue.put('L', 50);
        romanValue.put('C', 100);
        romanValue.put('D', 500);
        romanValue.put('M', 1000);

        int result = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int value = romanValue.get(s.charAt(i));

            if (i < n - 1 && value < romanValue.get(s.charAt(i + 1))) {
                result -= value;
            } else result += value;
        }

        return result;
    }
}
