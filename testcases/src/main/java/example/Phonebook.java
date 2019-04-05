package example;

import java.util.HashMap;

public class Phonebook {

    HashMap<String, String> map = new HashMap<>();

    public void add(String name, String number){
        map.put(name, number);
        System.out.println(map);
    }

    public void remove(String name){
        map.remove(name);
        System.out.println(map);
    }

}
