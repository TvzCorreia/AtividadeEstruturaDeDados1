/**
 * Created by blanks_ on 25/04/17.
 */
public class ListaSeqNaoOrd extends ListaSequencial {

    @Override
    public boolean remove(Comparable obj) {
        int index = dados.procuraPosicao(obj);
        dados.removeAt(index);
        return true;
    }

    @Override
    public Comparable retrieve(Comparable obj) {
        int index = dados.procuraPosicao(obj);
        return (Comparable) dados.getElement(index);
    }

    @Override
    public boolean add(Comparable obj) {
        int tamanho = dados.numItens;
        dados.insertAtEnd(obj);
        numItens++;
        return true;
    }
}
