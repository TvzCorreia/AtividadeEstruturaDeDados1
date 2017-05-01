import java.util.Iterator;


public abstract class MyIterator<E> implements Iterator<E> {

    public abstract Object getFirst();

    public abstract Object getNext();
}