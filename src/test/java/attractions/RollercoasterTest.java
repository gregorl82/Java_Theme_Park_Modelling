package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(19, 188, 22.0);
        visitor2 = new Visitor(25, 202, 25.0);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(8.4, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void chargesDefaultPriceForVisitorUnder200cm(){
        assertEquals(8.4, rollerCoaster.priceFor(visitor1), 0.01);
    }

    @Test
    public void chargesDoublePriceForVisitorOver200cm(){
        assertEquals(16.8, rollerCoaster.priceFor(visitor2), 0.01);
    }
}
