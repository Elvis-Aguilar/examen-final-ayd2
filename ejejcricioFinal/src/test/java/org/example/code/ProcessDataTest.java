package org.example.code;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProcessDataTest {

    private ProcessData processData = new ProcessData();

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
        List<String> ouput1 = processData.processData(input1);
        List<String> ouput2 = processData.processData(input2);

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
        List<String> ouput1 = processData.processData(input1);
        List<String> ouput2 = processData.processData(input2);

        //assert
        Assertions.assertNotEquals(ouputSpected1.size(), ouput1.size());
        Assertions.assertNotEquals(ouputSpected2.size(), ouput2.size());

    }

}