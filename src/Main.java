/**
 * Created by blanks_ on 25/04/17.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Lista Sequencialmente Ordenada");
        System.out.println();
        ListaSeqOrd lso = new ListaSeqOrd();

        // Metodo ADD, este metodo adciona de forma ordenada em nossa Lista Sequencial Ordenada
        // Basta apenas eu passar o objeto do tipo COMPARABLE como parametro.
        lso.add(1);
        lso.add(3);
        lso.add(5);
        lso.add(2);
        System.out.println("Elementos que foram adcionados a nossa lista");
        // Metodo toString() retorna tudo que contem em nossa lista.
        System.out.println(lso.toString());

        // Metodo REMOVE, este metodo remove e mantem a lista de uma forma que ela continue ordenada;
        // Basta apenas passar um objeto do tipo COMPARABLE como parametro.
        lso.remove(2);
        System.out.println("Lista depois da remoção do objeto 2");
        System.out.println(lso.toString());

        System.out.println("Lista Sequencialmente Não Ordenada");
        System.out.println();
        ListaSeqNaoOrd lson = new ListaSeqNaoOrd();

        lson.add(1);
        lson.add(3);
        lson.add(5);
        lson.add(2);

        System.out.println("Elementos que foram adcionados a nossa lista");
        // Metodo toString() retorna tudo que contem em nossa lista.
        System.out.println(lson.toString());

        lso.remove(2);
        System.out.println("Lista depois da remoção do objeto 2");
        System.out.println(lson.toString());

        //Aqui retorno um objeto tipo comparable o qual foi passado no parametro do metodo RETRIEVER, o qual retorna null
        //se não existir o elemento na lista, o metodo contem tanto na LISTA SEQUENCIALMENTE ORDENADA E NA NÃO ORDENADA

        //Com sucesso
        if(lson.retrieve(1) != null)
            System.out.println(lson.retrieve(9));
        else
            System.out.println("Objeto não contem no Array");

        //Falhando
        if(lson.retrieve(9) != null)
            System.out.println(lson.retrieve(9));
        else
            System.out.println("Objeto não contem no Array");






    }
}
