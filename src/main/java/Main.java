import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listaDeCompras = new ArrayList<>();
        listaDeCompras.add("Mamão");
        listaDeCompras.add("Sabão em pó");
        listaDeCompras.add("Macarrão");
        listaDeCompras.add(1,"Banana");

        for (String item : listaDeCompras) {
            System.out.println(item);
        }

        String item = listaDeCompras.get(3);
        System.out.println("Na posição 3 eu tenho: " + item);

        listaDeCompras.remove("Sabão em pó");

        for(String item2 : listaDeCompras){
            System.out.println(item2);
        }

        boolean eVazio = listaDeCompras.isEmpty();
        int tamanho = listaDeCompras.size();
        boolean contem = listaDeCompras.contains("Arroz");

        System.out.println("Lista vazia? " + eVazio);
        System.out.println("Tamanho da lista: " + tamanho);
        System.out.println("Lista contem o item Arroz? " + contem);

        listaDeCompras.forEach(produto -> System.out.println("Produtos: " + produto));

        listaDeCompras.clear();
        System.out.println("A lista está vazia? " + listaDeCompras.isEmpty());



    }

}