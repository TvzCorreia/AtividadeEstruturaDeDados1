public class MyVetorIterator<E> extends MyIterator<E> {

    protected int posicao;
    protected Vetor<E> lista;


    public MyVetorIterator(Vetor<E> obj) {
        this.posicao = 0;
        this.lista = obj;
    }

    @Override
    public boolean hasNext() {
        if (posicao == lista.numItens)
            return false;

        return true;
    }

    @Override
    public E next() {
        E obj = this.lista.getElement(posicao);
        posicao++;
        return obj;
    }

    @Override
    public Object getFirst() {
        return this.lista.getElement(0);
    }

    @Override
    public Object getNext() {
        if (hasNext())
            return next();
        return null;
    }

}