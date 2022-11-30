import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteArrayListOrdenacao {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Alexandre");
        nomes.add("Daniella");
        nomes.add("Alice");
        nomes.add("Athos");

        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        System.out.println("*****************************************************");

        Collections.sort(nomes);
        for (String nome: nomes) {
            System.out.println(nome);
        }

        System.out.println("*****************************************************");

        ArrayList<Produto> produtos = new ArrayList<>();

        Produto p1 = new Produto("Nokia 5210", 599.90);
        Produto p2 = new Produto("Notebook Dell Inspiron", 5600.90);
        Produto p3 = new Produto("Iphone 12", 5699.90);

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        //Collections.sort(produtos);
        //Collections.sort(produtos, new PrecoProdutoComparator());
        produtos.sort(new PrecoProdutoComparator());
        for (Produto produto: produtos) {
            System.out.println("Nome: " + produto.getNome() + "\nPreço: " + produto.getPreco());
        }

    }
}

class PrecoProdutoComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return (int) (p1.getPreco() - p2.getPreco()) ;
    }

}
