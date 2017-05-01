public abstract class ListaSequencial<E extends Comparable<E>> extends ColecaoComparavel<E> {

    protected Vetor<E> dados = new Vetor<E>();

    @Override

    public int size() {

        return dados.size();

    }

    @Override

    public abstract E retrieve(E obj);

    @Override

    public abstract boolean add(E obj);

    @Override

    public void clear() {

        this.dados.clear();

    }

    @Override

    public MyIterator<E> iterator() {

        return this.dados.iterator();

    }


    public String toString() {

        StringBuilder sb = new StringBuilder();

        MyIterator<E> itr = dados.iterator();

        sb.append("[ ");

        while (itr.hasNext()) {

            E dado = itr.next();

            sb.append(dado);

            sb.append(", ");

        }

        sb.deleteCharAt(sb.length() - 1);//Remove último espaço branco

        sb.deleteCharAt(sb.length() - 1);//Remove última vírgula

        sb.append(" ]");

        return sb.toString();

    }
}