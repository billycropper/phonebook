package Phonebook;

public class Main {

    public static void main(String[] args) {

        //HashMap<String, String> phonebook = new HashMap<>();
        String[] num = new String[]{"12345","234567","443223"};
        String[] num1 = new String[]{"8654","890","35"};


        PhoneBook phonebook1 = new PhoneBook();
        phonebook1.addAll("Billy", num);
        phonebook1.addAll("John", num1);
        phonebook1.add("William", "393928");
        phonebook1.add("Chris", "23983928");

        System.out.println("================================================================");

        phonebook1.remove("Chris");
        //System.out.println(phonebook1.hasEntry("William"));
        //System.out.println(phonebook1.lookup("John"));
        phonebook1.getAllContactNames();

        System.out.println("================================================================");

        System.out.println(phonebook1.reverseLookup("393928"));
        phonebook1.lookup("William");


    }


}
