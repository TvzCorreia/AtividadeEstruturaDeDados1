public abstract class ColecaoNaoComparavel<E> implements Colecao<E> {

    protected int numItens;

    @Override
    public boolean isEmpty() {
        return (numItens == 0);

    }

    @Override

    public abstract int size();

    public Object[] toArray() {

        if (isEmpty())

            return null;

        Object[] objs = new Object[numItens - 1];

        MyIterator<E> it = iterator();

        int i = 0;

        Object obj;

        while (i < objs.length) {


            obj = it.getNext();


            objs[i] = obj;


            i++;

        }

        return objs;

    }
}