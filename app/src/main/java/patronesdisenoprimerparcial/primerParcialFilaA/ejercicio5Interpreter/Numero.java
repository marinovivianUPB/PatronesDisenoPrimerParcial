package patronesdisenoprimerparcial.primerParcialFilaA.ejercicio5Interpreter;

public class Numero extends ExpresionNumerica{

    private int size;

    public Numero(int size){
        this.size = size;
    }

    @Override
    public void interpreter(Context context) {
        if(context.multi){
            context.output = context.output* Integer.parseInt(context.input.substring(0, size));
            context.multi=false;
        } else{
            context.output = context.output+Integer.parseInt(context.input.substring(0, size));
        }
        context.input = context.input.substring(size);
    }
    
}

