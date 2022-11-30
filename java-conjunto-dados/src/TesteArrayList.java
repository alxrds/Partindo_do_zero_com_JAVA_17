import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {

        ArrayList lista = new ArrayList();

        Produto p1 = new Produto("Nokia 5210", 599.90);
        Produto p2 = new Produto("Notebook Dell Inspiron", 5600.90);
        Produto p3 = new Produto("Iphone 12", 5699.90);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        Produto celular = (Produto) lista.get(0);

        System.out.println("Nome:" + celular.getNome() + "\nPreço: " + celular.getPreco());

    }
}
