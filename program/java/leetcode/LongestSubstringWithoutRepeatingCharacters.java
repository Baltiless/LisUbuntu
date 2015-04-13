import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters{
    public static int lengthOfLongestSubstring(String s){
        HashSet<Character> hs = new HashSet<Character>();
        int max = 0;
        int leftbound = 0;
        for(int i = 0;i < s.length();i++){
            if(hs.contains(s.charAt(i))){
                while(leftbound < i && s.charAt(leftbound) != s.charAt(i)){
                    hs.remove(s.charAt(leftbound));
                    leftbound++;
                }
                leftbound++;
            } else{
                hs.add(s.charAt(i));
                max = Math.max(max, i - leftbound + 1);
            }
        }
        return max;
    }
    public static int lengthOfLongestSubstringAlt(String s){
        if(s == null || s.length() == 0) return 0;
        int max = 0;
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int i, j;
        for(i = 0, j = 0;j < s.length();){
            Integer last = hm.get(s.charAt(j));
            if(last != null && last >= i){
                max = Math.max(max, j - i);
                i = last + 1;
            }
            hm.put(s.charAt(j), j);
            j++;
        }
        return Math.max(max, j - i);
    }
    public static int lengthOfLongestSubstringAlt2(String s){
        if(s == null || s.length() == 0) return 0;
        int max = 0;
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int i, j;
        for(i = 0, j = 0;j < s.length();j++){
            Character curr = s.charAt(j);
            if(!hm.containsKey(curr) || hm.get(curr) < i){
                max = Math.max(max, j + 1 - i);
            }
            else{
                i = hm.get(curr) + 1;
                //System.out.println("i:" + i);
            }
            hm.put(curr, j);
        }
        return max; 
    }
    public static int lengthOfLongestSubstringAlt3(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int output = 0;
        int i, j;
        for(i = 0, j = 0;j < s.length();j++) {
            Character cur = s.charAt(j);
            if(hm.containsKey(cur)) {
                output = Math.max(output, j - i);
                i = Math.max(i, hm.get(cur) + 1);
            }
            hm.put(cur, j);
        }
        output = Math.max(output, j - i); 
        return output;
    }
    public static void main(String[] args){
        //String input = "abcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+{}[]|~``~|][}{+=_-)(*&^%$#@!ZYXWVUTSRQPONMLKJIHGFEDCBA0987654321zyxwvutsrponmlkjihgfedcbaabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+{}[]|~``~|][}{+=_-)(*&^%$#@!ZYXWVUTSRQPONMLKJIHGFEDCBA0987654321zyxwvutsrponmlkjihgfedcbaabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+{}[]|~``~|][}{+=_-)(*&^%$#@!ZYXWVUTSRQPONMLKJIHGFEDCBA0987654321zyxwvutsrponmlkjihgfedcbaabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+{}[]|~``~|][}{+=_-)(*&^%$#@!ZYXWVUTSRQPONMLKJIHGFEDCBA0987654321zyxwvutsrponmlkjihgfedcbaabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+{}[]|~``~|][}{+=_-)(*&^%$#@!ZYXWVUTSRQPONMLKJIHGFEDCBA0987654321zyxwvutsrponmlkjihgfedcbaabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+{}[]|~``~|][}{+=_-)(*&^%$#@!ZYXWVUTSRQPONMLKJIHGFEDCBA0987654321zyxwvutsrponmlkjihgfedcbaabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+{}[]|~``~|][}{+=_-)(*&^%$#@!ZYXWVUTSRQPONMLKJIHGFEDCBA0987654321zyxwvutsrponmlkjihgfedcbaabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+{}[]|~``~|][}{+=_-)(*&^%$#@!ZYXWVUTSRQPONMLKJIHGFEDCBA0987654321zyxwvutsrponmlkjihgfedcbaabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+{}[]|~``~|][}{+=_-)(*&^%$#@!ZYXWVUTSRQPONMLKJIHGFEDCBA0987654321zyxwvutsrponmlkjihgfedcbaabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+{}[]|~``~|][}{+=_-)(*&^%$#@!ZYXWVUTSRQPONMLKJIHGFEDCBA0987654321zyxwvutsrponmlkjihgfedcbaabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+{}[]|~``~|][}{+=_-)(*&^%$#@!ZYXWVUTSRQPONMLKJIHGFEDCBA0987654321zyxwvutsrponmlkjihgfedcbaabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+{}[]|~``~|][}{+=_-)(*&^%$#@!ZYXWVUTSRQPONMLKJIHGFEDCBA0987654321zyxwvutsrponmlkjihgfedcbaabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+{}[]|~``~|][}{+=_-)(*&^%$#@!ZYXWVUTSRQPONMLKJIHGFEDCBA0987654321zyxwvutsrponmlkjihgfedcbaabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+{}[]|~``~|][}{+=_-)(*&^%$#@!ZYXWVUTSRQPONMLKJIHGFEDCBA0987654321zyxwvutsrponmlkjihgfedcbaabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+{}[]|~``~|][}{+=_-)(*&^%$#@!ZYXWVUTSRQPONMLKJIHGFEDCBA0987654321zyxwvutsrponmlkjihgfedcbaabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+{}[]|~``~|][}{+=_-)(*&^%$#@!ZYXWVUTSRQPONMLKJIHGFEDCBA0987654321zyxwvutsrponmlkjihgfedcbaabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+{}[]|~``~|][}{+=_-)(*&^%$#@!ZYXWVUTSRQPONMLKJIHGFEDCBA0987654321zyxwvutsrponmlkjihgfedcbaabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+{}[]|~``~|][}{+=_-)(*&^%$#@!ZYXWVUTSRQPONMLKJIHGFEDCBA0987654321zyxwvutsrponmlkjihgfedcbaabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+{}[]|~``~|][}{+=_-)(*&^%$#@!ZYXWVUTSRQPONMLKJIHGFEDCBA0987654321zyxwvutsrponmlkjihgfedcbaabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+{}[]|~``~|][}{+=_-)(*&^%$#@!ZYXWVUTSRQPONMLKJIHGFEDCBA0987654321zyxwvutsrponmlkjihgfedcbaabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+{}[]|~``~|][}{+=_-)(*&^%$#@!ZYXWVUTSRQPONMLKJIHGFEDCBA0987654321zyxwvutsrponmlkjihgfedcbaabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+{}[]|~``~|][}{+=_-)(*&^%$#@!ZYXWVUTSRQPONMLKJIHGFEDCBA0987654321zyxwvutsrponmlkjihgfedcbaabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+{}[]|~``~|][}{+=_-)(*&^%$#@!ZYXWVUTSRQPONMLKJIHGFEDCBA0987654321zyxwvutsrponmlkjihgfedcbaabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+{}[]|~``~|][}{+=_-)(*&^%$#@!ZYXWVUTSRQPONMLKJIHGFEDCBA0987654321zyxwvutsrponmlkjihgfedcbaabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+{}[]|~``~|][}{+=_-)(*&^%$#@!ZYXWVUTSRQPONMLKJIHGFEDCBA0987654321zyxwvutsrponmlkjihgfedcba";
        String input = "wlrbbmqbhcdarzow";
        long start = System.currentTimeMillis();
        //System.out.println(lengthOfLongestSubstring(input)); 2ms
        //System.out.println(lengthOfLongestSubstringAlt(input)); 3ms
        //System.out.println(lengthOfLongestSubstringAlt2(input)); 2ms
        System.out.println(lengthOfLongestSubstringAlt3(input)); //2ms
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
