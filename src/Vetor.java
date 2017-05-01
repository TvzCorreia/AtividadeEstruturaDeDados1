import java.io.Serializable;

public class Vetor<E> implements Serializable {

    //Valor inicial do tamanho do array (default)
    private final int CAPACIDADE_DEFAULT = 2;

    //Array onde os dados serão armazenados
    private E[] lista;

    //Valores informados pelo usuário para a capacidade
    //inicial e para o incremento a ser utilizado quando
    //o array for redimensionado
    protected int incremento, capacidadeInicial;

    //Total de dados armazenados no array
    protected int numItens;

    //Construtores
    public Vetor() {
        lista = (E[]) new Object[CAPACIDADE_DEFAULT];
        incremento = 10;
        capacidadeInicial = CAPACIDADE_DEFAULT;
    }

    public Vetor(int capacidadeInicial) {
        lista = (E[]) new Object[capacidadeInicial];
        this.incremento = 10;
        this.capacidadeInicial = capacidadeInicial;
    }

    public Vetor(int capacidadeInicial,
                 int incremento) {
        lista = (E[]) new Object[capacidadeInicial];
        this.incremento = incremento;
        this.capacidadeInicial = capacidadeInicial;
    }

    public E getElement(int pos){
        return lista[pos];
    }

    public int procuraPosicao(Comparable obj) {

        int inicio, fim, meio, c;

        inicio = 0;

        fim = numItens - 1;

        while (inicio <= fim) {

            meio = (inicio + fim) / 2;

            c = obj.compareTo(lista[meio]);

            if (c > 0)

                inicio = meio + 1;

            else

                fim = meio - 1;

        }

        return inicio;
    }

    public void imprime(){
        for(E i : lista){
            System.out.print(i + "| ");
        }
    }

    //Métodos
    public void clear() {
        for (int i = 0; i < this.lista.length; i++)
            this.lista[i] = null;
        this.lista = (E[]) new Object[capacidadeInicial];
        this.numItens = 0;
    }

    public int getIndex(Comparable obj){
        for (int i = 0; i < lista.length; i++) {
            if(lista[i] == obj) {
                return i;
            }
        }
        return -1;
    }

    public void insertAtEnd(E obj) {
        if (numItens == lista.length) {
            this.lista = this.resize(lista, lista.length + incremento);
        }
        this.lista[numItens] = (E) obj;
        this.numItens++;
    }

    public boolean insertAt(int indice, E obj) {
        if ((indice < 0) && (indice >= this.lista.length))
            return false;

        if (numItens == lista.length) {
            this.lista = this.resize(lista, lista.length + incremento);
        }

        // Abrir espaço para inserção
        for (int i = numItens ; i > indice; i--) {
            this.lista[i] = this.lista[i-1];
        }

        this.lista[indice] = (E) obj;
        this.numItens++;
        return true;
    }

    public boolean insertAtBegin(E obj) {
        return insertAt(0, obj);
    }

    public E removeFromEnd() {
        if (this.isEmpty())
            return null;

        E obj = this.lista[numItens-1];
        this.lista[numItens-1] = null;
        numItens--;

        return obj;
    }

    public E removeAt(int indice) {
        if (this.isEmpty() || (indice < 0) || (indice >= this.numItens))
            return null;

        E obj = this.lista[indice];

        // Organizar o espaço da remoção
        for (int i = indice; i < numItens; i++) {
            this.lista[i] = this.lista[i+1];
        }
        this.lista[numItens-1] = null;
        this.numItens--;

        return obj;
    }

    public E removeFromBegin() {
        return removeAt(0);
    }

    public boolean replace(int indice, E obj) {
        if ((indice < 0) && (indice >= this.lista.length))
            return false;
        this.lista[indice] = obj;
        return true;
    }


    public boolean isEmpty() {
        return (numItens == 0);
    }

    public int size() {
        return this.numItens;
    }

    private E[] resize(E[] lista, int tamanho) {
        E[] listaAux = (E[]) new Object[tamanho];

        for (int i = 0; i < this.lista.length; i++) {
            listaAux[i] = this.lista[i];
        }
        return listaAux;
    }

    public MyIterator<E> iterator() {
        return new MyVetorIterator<E>(this);
    }
}