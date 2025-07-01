import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ListaFrutas {
    private List<String> frutas = new ArrayList<>();

    // Construtor que inicializa com 5 frutas
    public ListaFrutas() {
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Uva");
        frutas.add("Abacaxi");
    }

    // Insere uma nova fruta na lista
    public void inserir(String fruta) {
        if (fruta != null && !fruta.trim().isEmpty()) {
            frutas.add(fruta);
            System.out.println("Fruta '" + fruta + "' adicionada com sucesso!");
        } else {
            System.out.println("Nome da fruta não pode ser vazio!");
        }
    }

    // Altera uma fruta existente
    public boolean alterar(String frutaAntiga, String frutaNova) {
        if (frutaNova == null || frutaNova.trim().isEmpty()) {
            System.out.println("Nome da nova fruta não pode ser vazio!");
            return false;
        }

        int index = frutas.indexOf(frutaAntiga);
        if (index != -1) {
            frutas.set(index, frutaNova);
            System.out.println("Fruta '" + frutaAntiga + "' alterada para '" + frutaNova + "'");
            return true;
        } else {
            System.out.println("Fruta '" + frutaAntiga + "' não encontrada!");
            return false;
        }
    }

    // Exclui uma fruta da lista
    public boolean excluir(String fruta) {
        boolean removido = frutas.remove(fruta);
        if (removido) {
            System.out.println("Fruta '" + fruta + "' removida com sucesso!");
        } else {
            System.out.println("Fruta '" + fruta + "' não encontrada!");
        }
        return removido;
    }

    // Lista todas as frutas
    public void listar() {
        if (frutas.isEmpty()) {
            System.out.println("A lista de frutas está vazia!");
        } else {
            System.out.println("Lista de Frutas:");
            frutas.forEach(System.out::println);
        }
    }

    // Encontra uma fruta pelo nome (case insensitive)
    public String encontrar(String nomeFruta) {
        for (String fruta : frutas) {
            if (nomeFruta.equals(fruta)) {
                return nomeFruta;
            }
        }
        return "";
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        ListaFrutas lista = new ListaFrutas();

        System.out.println("--- Lista Inicial ---");
        lista.listar();

        System.out.println("\n--- Inserindo Fruta ---");
        lista.inserir("Morango");

        System.out.println("\n--- Alterando Fruta ---");
        lista.alterar("Banana", "Banana Nanica");

        System.out.println("\n--- Tentando Alterar Fruta Inexistente ---");
        lista.alterar("Pêra", "Pêssego");

        System.out.println("\n--- Buscando Fruta ---");
        String f;
        f = lista.encontrar("Uva");
        System.out.println("Fruta encontrada: " + f);

        System.out.println("\n--- Tentando Buscar Fruta Inexistente ---");
        f = lista.encontrar("Melancia");

        if(f.isEmpty()){
            System.out.println("Fruta não encontrada");
        }else{
            System.out.println("Fruta encontrada: " + f);
        }

        System.out.println("\n--- Excluindo Fruta ---");
        lista.excluir("Uva");

        System.out.println("\n--- Tentando Excluir Fruta Inexistente ---");
        lista.excluir("Pêra");

        System.out.println("\n--- Lista Final ---");
        lista.listar();
    }
}
