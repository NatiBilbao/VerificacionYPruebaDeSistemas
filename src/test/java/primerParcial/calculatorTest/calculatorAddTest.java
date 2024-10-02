package primerParcial.calculatorTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import primerParcial.unitTest.Calculator;

public class calculatorAddTest {
    @Test
    public void verifyAddPositiveNumber(){
        Calculator calculator = new Calculator();
        int expectedResult = 4;
        int actualResult = calculator.add(2,2);
        Assertions.assertEquals(expectedResult,actualResult,
                "ERROR las suma es incorrecta, revise el codigo!");
    }
}
