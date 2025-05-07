package org.example.code;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClaculationTest {

    private Claculation claculation;

    @Test
    void TestCalculateAreaOk(){
        //arrange
        double[] array1 = {1.2,12.2};
        double spectedCicle = 4.523893421169302;
        double spectedRectangle = 14.639999999999999;
        double spectedTriangle = 7.319999999999999;

        //arc
        double ouputCircle = claculation.calculateArea("circle",array1);
        double ouputectangle = claculation.calculateArea("rectangle",array1);
        double ouputriangle = claculation.calculateArea("triangle",array1);

        //assert
        Assertions.assertEquals(spectedCicle, ouputCircle);
        Assertions.assertEquals(spectedRectangle, ouputectangle);
        Assertions.assertEquals(spectedTriangle, ouputriangle);

    }

}