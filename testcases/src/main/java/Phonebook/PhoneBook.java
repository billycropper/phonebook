package Phonebook;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    public String name;
    public String phoneNumbers;

    HashMap<String, String> phonebook = new HashMap<>();

    public void add(String name, String phoneNumbers){
        phonebook.put(name, phoneNumbers);
        System.out.println(phonebook);
    }

    public void addAll(String name, String[] phoneNumbers){
        phonebook.put(name, Arrays.toString(phoneNumbers));
//        HashMap<String, String[]> nums = new HashMap<>();
//        ArrayList<String> nums = new ArrayList<>(Arrays.asList(phoneNumbers));
//        nums.put(name, phoneNumbers);
//        phonebook.putAll(nums);
        System.out.println(phonebook);
    }

    public void remove(String name){
        phonebook.remove(name);
        System.out.println(phonebook);
    }

    public boolean hasEntry(String name){
        return phonebook.containsKey(name);
    }
    public String lookup(String name){
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber){
        if(phonebook.containsValue(phoneNumber)){
            for(Map.Entry<String, String> i : phonebook.entrySet()){
                if(i.getValue().equals(phoneNumber)){
                    System.out.println(i.getKey());
                }
            }
        }
        return phoneNumber;
    }

    public String getAllContactNames(){
      for(Map.Entry<String, String> i : phonebook.entrySet()){
          String key = i.getKey();
          System.out.println(key);
      }
      return name;
    }


}
