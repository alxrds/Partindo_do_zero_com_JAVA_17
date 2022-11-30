public class TesteArrayReferencia {
    public static void main(String[] args) {

        Produto[] produtos = new Produto[4];

        produtos[0] = new Produto("Notebook G7 Dell i7", 12000.99);
        produtos[1] = new Produto("Iphone 13", 6799.89);

        for(int i=0; i< produtos.length; i++){
            System.out.println("Produto: " + produtos[i].getNome() + "\nPreço: " + produtos[i].getPreco());
        }

    }
}
