package patronesdisenoprimerparcial.templates.Prototype;

public class ClientPrototype {
    public static void main(String []args){
        ConcretePrototype object1 = new ConcretePrototype();
        object1.setAttribute1("value 1");
        object1.setAttribute2("value 2");
        object1.setAttribute3("value 3");
        object1.setAttribute4("value 4");
        object1.setAttribute5("value 5");
        object1.setAttribute6("value 6");
        object1.setAttribute7("value 7");
        object1.setAttribute8("value 8");
        object1.setAttribute9("value 9");
        System.out.println(" INFO> Object1 : "+object1.getAttribute1());

        ConcretePrototype object2 = object1.clone();
        object2.setAttribute1("new attribute for object 2");

        System.out.println("Object2 : "+object2.getAttribute1());
        System.out.println("Object1 : "+object1.getAttribute1());

    }
}
