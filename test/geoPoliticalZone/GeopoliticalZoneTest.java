package geoPoliticalZone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeopoliticalZoneTest {
    GeoPoliticalZone geoZone;

    @BeforeEach
    public void setUp() {
        geoZone = new GeoPoliticalZone();
    }

    @Test
    public void testThatA_geoPoliticalZonReturnsTheString() {
        String result = geoZone.checkZone("Kwara");
        assertEquals("Geo-Political Zone: North Central", result);
    }

    @Test
    public void testThatStatesAreCaseInsensitive() {
        String result = geoZone.checkZone("LAGOS");
        assertEquals("Geo-Political Zone: South West", result);
    }

    @Test
    public void testThatStatesNotInGeoPoliticalZoneReturnInvalid() {
        String result = geoZone.checkZone("Madrid");
        assertEquals("Invalid state entered.", result);
    }

    @Test
    public void testA_geoPoliticalZoneWithHyphen() {
        String result = geoZone.checkZone("Akwa-Ibom");
        assertEquals("Geo-Political Zone: South South", result);
    }
}
