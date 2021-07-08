package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CandyTest {

    @Test

    public void setNameTest(){

        //GIVEN
        String expected = "MILKCHOCOLATE";

        //WHEN
        Candy testCandy = new Candy();
        testCandy.setName(expected);

        //WHEN
        Assertions.assertEquals(expected, testCandy.getName());




    }

    



}
