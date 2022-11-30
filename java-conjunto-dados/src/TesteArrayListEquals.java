import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {

        ArrayList<Produto> lista = new ArrayList<>();

        Produto p1 = new Produto("Nokia 5210", 599.90);
        Produto p2 = new Produto("Notebook Dell Inspiron", 5600.90);
        Produto p3 = new Produto("Iphone 12", 5699.90);
        Produto p4 = new Produto("Iphone 12", 5699.90);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);

        System.out.println(lista.contains(p3));
        System.out.println(lista.indexOf(p3));

        if(p3.equals(p4)){
            System.out.println("São iguais");
        }else{
            System.out.println("São diferentes");
        }

    }
}
