package patronesdisenoprimerparcial.primerParcialFilaA.ejercicio5Interpreter;

public class Multiplicacion extends ExpresionNumerica{

    @Override
    public void interpreter(Context context) {
        context.multi=true;
        context.input = context.input.substring(1);
    }
    
}
