package patronesdisenoprimerparcial.templates.Iterator;

public class ConcreteIteratorA implements Iterator{

    private String [] names;
    private int position=0;

    public ConcreteIteratorA(String [] names){
        this.names=names;
    }

    @Override
    public boolean hasNext() {
        return this.names.length != 0 && position<this.names.length;
    }

    @Override
    public Object next() {
        return this.names[position++];
    }
    
}
