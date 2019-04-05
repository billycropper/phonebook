import Phonebook.PhoneBook;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

public class PhonebookTest {

    @Test
    public void addTest(){
        //Given
        PhoneBook book = new PhoneBook();
        String expected = "12345";

        book.add("William", "12345");
        String actual = book.lookup("William");

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void addAllTest(){
        HashMap<String, String> map = new HashMap<>();
        //Given
        String[] num = new String[]{"12345","234567","443223"};
        String expected = "{Billy=[12345, 234567, 443223]}";

        map.put("Billy", Arrays.toString(num));
        String actual = map.toString();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeTest(){
        PhoneBook book = new PhoneBook();
        String expected = "{}";

        //book.add("William", "123");
        book.add("Jack", "321");
        book.remove("Jack");

        String actual = "{}";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void hasEntryTest(){
        PhoneBook book = new PhoneBook();
        Boolean expected = true;

        book.add("William", "123");
        book.hasEntry("William");

        Boolean actual = true;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lookupTest(){
        PhoneBook book = new PhoneBook();
        String expected = "William";

        book.add("William", "123");
        book.lookup("William");

        String actual = "William";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseLookupTest(){
        PhoneBook book = new PhoneBook();
        String expected = "William";

        book.add("William", "123");
        book.reverseLookup("123");

        String actual = "William";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllContactNamesTest(){
        PhoneBook book = new PhoneBook();
        String expected = "Billy";

        book.add("Billy", "123");
        book.getAllContactNames();

        String actual = "Billy";

        Assert.assertEquals(expected, actual);
    }

}
