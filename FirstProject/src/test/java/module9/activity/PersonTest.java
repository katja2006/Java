package module9.activity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {

    private Person person;

    @Before
    public void setUp() throws Exception {
        // TODO: Initialize person object
        person = new Person();
    }

    @After
    public void tearDown() throws Exception {
        // TODO: Tear down person object (set to null)
        person = null;
    }

    @Test
    public void testGettersAndSetters() {
        // TODO: Test setWeight/getWeight and setHeight/getHeight
        person.setWeight(70);
        assertEquals(70, person.getWeight());

        person.setHeight(1.75f);
        assertEquals(1.75f, person.getHeight(), 0.001f);
    }

    @Test
    public void testGetBodyMassIndex() {
        // TODO: Test valid BMI categories (Underweight, Normal weight, Overweight, Obese)
        // Underweight
        assertEquals("Underweight",
                person.getBodyMassIndex(50, 1.80));

        // Normal weight
        assertEquals("Normal weight",
                person.getBodyMassIndex(70, 1.75));

        // Overweight
        assertEquals("Overweight",
                person.getBodyMassIndex(80, 1.70));

        // Obese
        assertEquals("Obese",
                person.getBodyMassIndex(100, 1.70));
        // TODO: Test invalid and boundary inputs (zero, negative values, > 600 weight, > 3.0 height)
        assertEquals("Invalid input",
                person.getBodyMassIndex(0, 1.70));

        assertEquals("Invalid input",
                person.getBodyMassIndex(-10, 1.70));

        assertEquals("Invalid input",
                person.getBodyMassIndex(601, 1.70));

        assertEquals("Invalid input",
                person.getBodyMassIndex(70, 0));

        assertEquals("Invalid input",
                person.getBodyMassIndex(70, -1.70));

        assertEquals("Invalid input",
                person.getBodyMassIndex(70, 3.1));
    }
}
