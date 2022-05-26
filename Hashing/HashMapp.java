package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapp {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ishan", 10);
        map.put("DSA", 15);
        map.put("Algo", 20);
        System.out.println(map);
        System.out.println(map.size());
        for (Map.Entry<String, Integer> e : map.entrySet())
            System.out.println(e.getKey() + ": -" + e.getValue());
        if (map.containsKey("Ishan"))
            System.out.println("YES");
        else
            System.out.println("NO");
        // map.remove("Ishan");
        // System.out.println(map.size());
        if (map.containsValue(15))
            System.out.println("YES");
        else
            System.out.println("NO");
        System.out.println(map.get("Ishan"));
        System.out.println(map.get("ISHAN"));

    }
}
