package patronesdisenoprimerparcial.primerParcialFilaA.ejercicio5Interpreter;

public class Client {
    public static void main(String[] args) {
        String msg = "2 * 3 + 5 + 5 + 5";
        Evaluador eval = new Evaluador(msg);
        System.out.println("RESPUESTA: "+eval.outputMessage());
    }
}
