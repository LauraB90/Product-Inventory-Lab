package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShoesTest {


    @Test
    public void ConstructorTest(){

        int expectedId = 6;
        String expectedName = "heels";
        String expectedBrand = "clarks";
        String expectedColor = "black";
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        //WHEN
        Shoes testShoes = new Shoes(expectedId, expectedName, expectedBrand,
                expectedColor, expectedQty,expectedPrice);

        //THEN
        Assertions.assertEquals(expectedId, testShoes.getId());
        Assertions.assertEquals(expectedName, testShoes.getName());
        Assertions.assertEquals(expectedBrand, testShoes.getBrand());
        Assertions.assertEquals(expectedColor, testShoes.getColor());
        Assertions.assertEquals(expectedQty, testShoes.getQty());
        Assertions.assertEquals(expectedPrice, testShoes.getPrice());
    }


    @Test
            public void SetNameTest() {
        //GIVEN
        String expected = "NEWSHOES";

        //WHEN

        Shoes testShoes = new Shoes(1, "heels", "black", "clarks", 3, 60);
        testShoes.setName(expected);

        //THEN
        Assertions.assertEquals(expected, testShoes.getName());
    }

    @Test
    public void SetBrandTest(){
        //GIVEN
        String expected = "clarks";

        //WHEN
        Shoes testShoes = new Shoes(1, "heels", "black", "clarks", 3, 60);
        testShoes.setBrand(expected);
        String Actual =  testShoes.getBrand();

        //THEN
        Assertions.assertEquals(expected, testShoes.getBrand());
    }

    @Test
    public void SetColorTest(){
        //GIVEN
        String expected = "black";

        //WHEN
        Shoes testShoes = new Shoes(1, "heels", "black", "clarks", 3, 60);
        testShoes.setColor(expected);
        String Actual = testShoes.getColor();

        //THEN
        Assertions.assertEquals(expected, testShoes.getColor());

    }

    @Test
    public void SetQtyTest(){
        //GIVEN
        int expected = 5;

        //WHEN
        Shoes testShoes = new Shoes(1, "heels", "black", "clarks", 3, 60);
        testShoes.setQty(expected);
        int Actual = testShoes.getQty();

        //THEN
        Assertions.assertEquals(expected, testShoes.getQty());

    }

    @Test
    public void SetPrizeTest (){
        //Given
        float expected = 60;

        //WHEN
        Shoes testShoes = new Shoes(1, "heels", "black", "clarks", 3, 60);
        testShoes.setPrize(expected);
        float Actual = testShoes.getPrize();

        //THEN
        Assertions.assertEquals(expected, testShoes.getPrize());
    }


}
