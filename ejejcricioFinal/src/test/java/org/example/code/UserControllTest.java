package org.example.code;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserControllTest {

    private UserControll userControll = new UserControll();
    private final String NAME_USER = "ELVIS";
    private final String EMAIL_USER = "elvis@gmail.com";
    private final String PHONE_USER = "40566060";
    private final String ADDRESS_USER = "zona 4";
    private final String CITY_USER = "Totonicapan";
    private final String ZIP_USER = "que??";
    private final String EMAIL_USER_FAILED = "elvisgmail.com";


    @Test
    void TestCreateUserOK(){
        //arrange
        String user1 = "User created: ELVIS";

        //arc
        String userOuput = userControll.createUser(NAME_USER, EMAIL_USER, PHONE_USER, ADDRESS_USER, CITY_USER, ZIP_USER);

        //assert
        Assertions.assertEquals(user1, userOuput);
    }

    @Test
    void TestCreateUserFailedNameNullOREmpty(){
        //arrange
        String user1 = "Name cannot be empty";

        //arc
        String userOuput = userControll.createUser(null, EMAIL_USER, PHONE_USER, ADDRESS_USER, CITY_USER, ZIP_USER);
        String userOuput2 = userControll.createUser("", EMAIL_USER, PHONE_USER, ADDRESS_USER, CITY_USER, ZIP_USER);

        //assert
        Assertions.assertEquals(user1, userOuput);
        Assertions.assertEquals(user1, userOuput2);

    }

    @Test
    void TestCreateUserFailedIvalidEmail(){
        //arrange
        String user1 = "Invalid email";

        //arc
        String userOuput = userControll.createUser(NAME_USER, EMAIL_USER_FAILED, PHONE_USER, ADDRESS_USER, CITY_USER, ZIP_USER);
        String userOuput2 = userControll.createUser(NAME_USER, null, PHONE_USER, ADDRESS_USER, CITY_USER, ZIP_USER);

        //assert
        Assertions.assertEquals(user1, userOuput);
        Assertions.assertEquals(user1, userOuput2);

    }

}