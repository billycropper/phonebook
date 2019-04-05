import org.junit.Assert;
import org.junit.Test;
import people.Person;

public class PersonTest {

    @Test
    public void getNameTest(){
        //Given
        Person person = new Person("French vanilla",24);
        String expected = "French vanilla";

        //When
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        Person person = new Person("William",23);
        String expected = "John";

        person.setName("John");
        String actual = person.getName();

        Assert.assertEquals(expected,actual);
    }

}
