import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTestClass {

    People test;

    @Before
    public void setup(){
        test = new People();
    }

    @Test
    public void nameGetterSetter(){
        String name = "bob";

        test.setName(name);

        assertTrue(test.getName().equals(name));

    }

    @Test
    public void ageGetterSetter(){
        int age= 28;

        test.setAge(age);

        assertEquals(test.getAge(), age);
    }

    @Test
    public void heightGetterSetter(){
        int height = 201;

        test.setHeight(height);

        assertEquals(test.getHeight(), height);
    }



}
