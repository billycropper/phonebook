package example;

public class Main {
    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();
        phonebook.add("William", "123");
        phonebook.add("Jack","456");

        phonebook.remove("William");

    }
}
