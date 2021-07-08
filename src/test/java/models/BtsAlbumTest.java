package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BtsAlbumTest {


    @Test
            public void SetNameTest() {
        //GIVEN
        String expected = "PERSONA";

        //WHEN

        BtsAlbum testBtsAlbum = new BtsAlbum();
        testBtsAlbum.setName(expected);

        //THEN
        Assertions.assertEquals(expected, testBtsAlbum.getName());
    }

}
