package org.example.code;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class FinalExampleTest {

    private FinalExample finalExample = new FinalExample();
    private final String NAME_USER = "ELVIS";
    private final String EMAIL_USER = "elvis@gmail.com";
    private final String PHONE_USER = "40566060";
    private final String ADDRESS_USER = "zona 4";
    private final String CITY_USER = "Totonicapan";
    private final String ZIP_USER = "que??";

    private final String EMAIL_USER_FAILED = "elvisgmail.com";


    @Test
    void TestProcessDataOK(){
        //arrange
        String input1 = "hola,mundo,prueba";
        String input2 = "hola,mundo1,prueba2";

        List<String> ouputSpected1 = new ArrayList<>();
        ouputSpected1.add("HOLA");
        ouputSpected1.add("MUNDO");
        ouputSpected1.add("PRUEBA");
        List<String> ouputSpected2 = new ArrayList<>();
        ouputSpected2.add("HOLA");

        //arc
        List<String> ouput1 = finalExample.processData(input1);
        List<String> ouput2 = finalExample.processData(input2);

        //assert
        Assertions.assertEquals(ouputSpected1.size(), ouput1.size());
        Assertions.assertEquals(ouputSpected2.size(), ouput2.size());

    }

    @Test
    void TestProcessDataFailed(){
        //arrange
        String input1 = "hola,mundo,prueba,valio";
        String input2 = "hola,mundo1,prueba2,valio2";

        List<String> ouputSpected1 = new ArrayList<>();
        ouputSpected1.add("HOLA");
        ouputSpected1.add("MUNDO");
        ouputSpected1.add("PRUEBA");
        List<String> ouputSpected2 = new ArrayList<>();
        ouputSpected1.add("HOLA");
        ouputSpected1.add("PRUEBA1");

        //arc
        List<String> ouput1 = finalExample.processData(input1);
        List<String> ouput2 = finalExample.processData(input2);

        //assert
        Assertions.assertNotEquals(ouputSpected1.size(), ouput1.size());
        Assertions.assertNotEquals(ouputSpected2.size(), ouput2.size());

    }

    @Test
    void TestCreateUserOK(){
        //arrange
        String user1 = "User created: ELVIS";

        //arc
        String userOuput = finalExample.createUser(NAME_USER, EMAIL_USER, PHONE_USER, ADDRESS_USER, CITY_USER, ZIP_USER);

        //assert
        Assertions.assertEquals(user1, userOuput);
    }

    @Test
    void TestCreateUserFailedNameNullOREmpty(){
        //arrange
        String user1 = "Name cannot be empty";

        //arc
        String userOuput = finalExample.createUser(null, EMAIL_USER, PHONE_USER, ADDRESS_USER, CITY_USER, ZIP_USER);
        String userOuput2 = finalExample.createUser("", EMAIL_USER, PHONE_USER, ADDRESS_USER, CITY_USER, ZIP_USER);

        //assert
        Assertions.assertEquals(user1, userOuput);
        Assertions.assertEquals(user1, userOuput2);

    }

    @Test
    void TestCreateUserFailedIvalidEmail(){
        //arrange
        String user1 = "Invalid email";

        //arc
        String userOuput = finalExample.createUser(NAME_USER, EMAIL_USER_FAILED, PHONE_USER, ADDRESS_USER, CITY_USER, ZIP_USER);
        String userOuput2 = finalExample.createUser(NAME_USER, null, PHONE_USER, ADDRESS_USER, CITY_USER, ZIP_USER);

        //assert
        Assertions.assertEquals(user1, userOuput);
        Assertions.assertEquals(user1, userOuput2);

    }

    @Test
    void TestCalculateAreaOk(){
        //arrange
        double[] array1 = {1.2,12.2};
        double spectedCicle = 4.523893421169302;
        double spectedRectangle = 14.639999999999999;
        double spectedTriangle = 7.319999999999999;

        //arc
        double ouputCircle = finalExample.calculateArea("circle",array1);
        double ouputectangle = finalExample.calculateArea("rectangle",array1);
        double ouputriangle = finalExample.calculateArea("triangle",array1);

        //assert
        Assertions.assertEquals(spectedCicle, ouputCircle);
        Assertions.assertEquals(spectedRectangle, ouputectangle);
        Assertions.assertEquals(spectedTriangle, ouputriangle);

    }

}