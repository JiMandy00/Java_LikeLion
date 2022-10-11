package alphabet;

import java.util.HashMap;

public class alpabetCnt {

    // 알파벳이 맞는지 확인하는 함수
    public boolean isAlphabet(char ch) {

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        HashMap<Character, Integer> alphabetMap = new HashMap<>();

        // 소문자를 --> 대문자로
        String s1 = "aabbcccddefghijkk".toUpperCase();

        char[] alpabet = new char[s1.length()];

        // String을 한글자씩 출력할 수 있어야 한다.
        // charAt();
        // System.out.println(s1.charAt(0));
        // System.out.println(s1.charAt(2));
        // System.out.println(s1.charAt(s1.length()-1));

        // String 한글자씩 출력하기
        for (int i=0; i<s1.length(); i++) {
            // 하나씩 담아서
            char c = s1.charAt(i);
            boolean isAlphabet = alpabetCnt.isAlphabet(c);
            if(isAlphabet) {
               // 여기서 개수를 센다.
               alphabetMap.put(c, alphabetMap.get(c) + 1);
            }
        }
    }
}
