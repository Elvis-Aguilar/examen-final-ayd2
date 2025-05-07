package org.example.code;

import java.util.ArrayList;
import java.util.List;

/**\
 * refacorizando
 * 1. extraendo sub clases
 * 2. darle una unica responsabilidad
 *
 */
public class FinalExample { // ahora esta clase solo llama a los metodo de las clases

    private Claculation claculation;
    private ProcessData processData;
    private UserControll userControll;
    private Order order;
    private ReportGenerator reportGenerator;

    public FinalExample(Claculation claculation, ProcessData processData, UserControll userControll) {
        this.claculation = claculation;
        this.processData = processData;
        this.userControll = userControll;
    }

    public FinalExample(){

    }
}
