package patronesdisenoprimerparcial.templates.Singleton;

public class Singleton2 {
    //1) attribute same type
    //ESTE NO SE PUEDE MODIFICAR NUNCA, NO SE DESTRUYE
    private static final Singleton2 instance = new Singleton2();

    //2) constructor private
    private Singleton2(){
        System.out.println("Creacion deberia mostrarse 1 sola vez");
    }
    // global access
    public static Singleton2 getInstance(){
       return instance;
    }

    public void getName(){
        System.out.println("singleton ..");
    }
}
