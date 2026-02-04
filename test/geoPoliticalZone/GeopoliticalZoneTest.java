package geoPoliticalZone;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GeopoliticalZoneTest {

    @Test
    public void testThatContainsStateIsFoundInZone() {
        assertTrue(GeoPoliticalZone.NORTH_CENTRAL.containsState("FCT"));
        assertTrue(GeoPoliticalZone.SOUTH_WEST.containsState("Lagos"));
    }

    @Test
    public void testThatContainsStateIsCaseInsensitive() {
        assertTrue(GeoPoliticalZone.SOUTH_EAST.containsState("enugu"));
        assertTrue(GeoPoliticalZone.SOUTH_SOUTH.containsState(("Akwa-Ibom")));
    }

    @Test
    public void testThatContainsStateIsUnknown() {
        assertFalse(GeoPoliticalZone.NORTH_WEST.containsState("Osun"));
        assertFalse(GeoPoliticalZone.NORTH_EAST.containsState("Kwara"));
    }
}
