import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class PeopleTestClass {

    @Test
    public void testName(){
        String name = "bob";
        People test = new People(name);

        assertTrue(test.getName().equals(name));

    }

    @Test
    public void testAge(){
        int age= 28;
        People test = new People("", age);

        assertEquals(test.getAge(), age);
    }

}
