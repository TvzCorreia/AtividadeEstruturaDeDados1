import java.io.Serializable;

/**
 * Created by blanks_ on 25/04/17.
 */
public interface Colecao<E> extends Serializable {
    int size();
    boolean isEmpty();
    void clear();
    MyIterator<E> iterator();
    Object[] toArray();

}
