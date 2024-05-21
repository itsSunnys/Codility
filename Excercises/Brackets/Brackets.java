// https://app.codility.com/demo/results/training59KE8D-9FA/

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
        // using stack
        char[] char_arr = S.toCharArray();
        ArrayList<Character> stac = new ArrayList<>();

        for (char ch : char_arr) {
            // System.out.println("this is a debug message" + stac.size());
            if (ch == '(' ||  ch == '[' || ch == '{' ) {
                stac.add(ch);
            }
            else if (stac.size() <= 0) {
                return 0;
            }
            else
            {
                if (ch == ')' && stac.get(stac.size() - 1) != '(')
                    return 0;
                if (ch == '}' && stac.get(stac.size() - 1) != '{')
                    return 0;
                if (ch == ']' && stac.get(stac.size() - 1) != '[')
                    return 0;
                stac.remove(stac.size() - 1);
            }
        }
        if (stac.size() == 0) {
            return 1;
        }
        return 0;
    }
 }

