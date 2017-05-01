/**
 * Created by blanks_ on 25/04/17.
 */
public class Main {
    public static void main(String[] args) {

        ListaSeqOrd lso = new ListaSeqOrd();

        lso.add(1);
        lso.add(2);
        lso.add(4);
        lso.add(3);

        lso.remove(2);
        System.out.println(lso.toString());
        System.out.println(lso.retrieve(1));


    }
}
