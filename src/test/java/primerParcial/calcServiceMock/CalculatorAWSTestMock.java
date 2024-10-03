package primerParcial.calcServiceMock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import primerParcial.unitTest.CalcService;
import primerParcial.unitTest.CalculatorAWS;

public class CalculatorAWSTestMock {
    //Paso 2
    CalcService calcService = Mockito.mock(CalcService.class);

    @Test
    public void verifyFact(){
        //Paso 3
        Mockito.when(calcService.mul(1,1)).thenReturn(1);
        Mockito.when(calcService.mul(1,2)).thenReturn(2);
        Mockito.when(calcService.mul(2,3)).thenReturn(6);
        //Paso 4 **
        CalculatorAWS calculatorAWS = new CalculatorAWS();
        calculatorAWS.setCalcService(calcService);
        Assertions.assertEquals(6,calculatorAWS.getFact(3),"ERROR el factorial esta mal");
        //Paso 5
        Mockito.verify(calcService).mul(1,1);
        Mockito.verify(calcService).mul(1,2);
        Mockito.verify(calcService).mul(2,3);
    }
}
