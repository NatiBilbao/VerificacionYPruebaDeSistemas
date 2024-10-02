package primerParcial.ejerciciosEnClase;

public class notasColegio {
    public String getMessage(int nota){
        String message="";
        if (nota < 0 || nota > 100)
            return "ingrese nuevamente la nota!";

        if (nota >= 0 && nota <= 59 )
            message = "necesitas poner mas atencion a las clases";
        if (nota >= 60 && nota <= 70 )
            message = "necesitas estudiar mas";
        if (nota >= 71 && nota <= 80 )
            message = "muy bien hecho";
        if (nota >= 81 && nota <= 90 )
            message = "gano media beca";
        if (nota >= 91 )
            message = "gano beca";
        return message;
    }
}