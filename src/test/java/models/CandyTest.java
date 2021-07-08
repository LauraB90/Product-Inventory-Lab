package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CandyTest {

    @Test
    public void constructorTest(){

        //GIVEN
        int expectedId = 6;
        String expectedName = "Rockaleta";
        String expectedBrand = "Sonrics";
        String expectedKind = "lolli";
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        //WHEN
        Candy testCandy = new Candy(expectedId, expectedName, expectedBrand,
        expectedKind, expectedQty,expectedPrice);

        //THEN
        Assertions.assertEquals(expectedId, testCandy.getId());
        Assertions.assertEquals(expectedName, testCandy.getName());
        Assertions.assertEquals(expectedBrand, testCandy.getBrand());
        Assertions.assertEquals(expectedKind, testCandy.getKind());
        Assertions.assertEquals(expectedQty, testCandy.getQty());
        Assertions.assertEquals(expectedPrice, testCandy.getPrice());



    }











    @Test

    public void setNameTest(){

        //GIVEN
        String expected = "MILKCHOCOLATE";

        //WHEN
        Candy testCandy = new Candy(1, "CHOCO", "Sonrics", "lolli", 3, 10f);
        testCandy.setName(expected);

        //THEN
        Assertions.assertEquals(expected, testCandy.getName());




    }


    @Test

    public void setBrandTest(){

        //GIVEN
        String expected = "HERSHEY";

        //WHEN
        Candy testCandy = new Candy(1, "CHOCO", "Sonrics", "lolli", 3, 10f);
        testCandy.setBrand("HERSHEY");
        String Actual = testCandy.getBrand();

        //THEN
        Assertions.assertEquals(expected, testCandy.getBrand());


    }

    @Test

    public void setKindTest (){
        //GIVEN
        String expected = "sweet";

        //WHEN
        Candy testCandy = new Candy(1, "CHOCO", "Sonrics", "lolli", 3, 10f);
        testCandy.setKind("sweet");
        String Actual = testCandy.getKind();

        //THEN
        Assertions.assertEquals(expected, testCandy.getKind());
    }


    @Test
    public void setQtyTest(){
        //GIVEN
        int expected = 3;

        //WHEN
        Candy testCandy = new Candy(1, "CHOCO", "Sonrics", "lolli", 3, 10f);
        testCandy.setQty(3);
        int Actual = testCandy.getQty();

        //THEN
        Assertions.assertEquals(expected, testCandy.getQty());

    }

    @Test
    public void setPriceTest (){
        //GIVEN
        float expected = 10;

        //WHEN
        Candy testCandy = new Candy(1, "CHOCO", "Sonrics", "lolli", 3, 10f);
        testCandy.setPrice(10);
        float Actual = testCandy.getQty();

        //THEN
        Assertions.assertEquals(expected, testCandy.getPrice());

    }






}
