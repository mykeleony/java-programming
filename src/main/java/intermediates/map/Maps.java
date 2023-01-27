package intermediates.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "mykebosta");
        cookies.put("email", "myke.amorim@usp.br");
        cookies.put("phone", "11959524009");

        System.out.println(cookies);
        cookies.remove("email");
        System.out.println(cookies);

        System.out.println("ALL COOKIES: ");

        for (String cookie : cookies.keySet())
            System.out.println(cookie + ": " + cookies.get(cookie));

        cookies.put("username", "vexnus");

        System.out.println(cookies);

        System.out.println("Contains 'phone' key? " + cookies.containsKey("phone"));
        System.out.println("Contains 'myke' value? " + cookies.containsValue("myke"));
        System.out.println(cookies.get("inexistentKey"));
        System.out.println(cookies.size());
    }

}
