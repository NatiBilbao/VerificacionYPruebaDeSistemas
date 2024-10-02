package primerParcial.calcServiceMock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import primerParcial.unitTest.CalculatorAWS;

public class CalcServiceTestIncorrect {
    CalculatorAWS calculatorAWS;

    @Test
    public void verifyFact(){
        calculatorAWS = new CalculatorAWS();
        int expectedResult = 6;
        int actualResult =calculatorAWS.getFact(3);
        Assertions.assertEquals(expectedResult,actualResult,"ERROR el factorial es incorrecto");

    }
}
