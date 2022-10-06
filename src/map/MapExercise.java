package map;

import java.util.HashMap;
public class MapExercise {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("김경록", "https://github.com/Kyeongrok/like-lion-java");

        System.out.println(map.get("김경록"));
    }
}

