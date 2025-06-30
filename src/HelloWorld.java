import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Alô, mundo JAVA!");

//      ENTENDENDO VARIÁVEIS
//      ################################################################
        String nome = "Maria";
        Integer idade = 35;
        Boolean stado = true;
        Double valor = 3.45;

//      System.out.println(nome.getClass());
//      System.out.println(idade.getClass());
//      System.out.println(stado.getClass());
//      System.out.println(valor.getClass());

//      CAPTURANDO VALORES DO TERMINAL
//      ################################################################
//      Scanner input = new Scanner(System.in);
//
//      System.out.print("Qual o seu nome: ");
//      String nome = input.nextLine();
//
//      System.out.println("Alô "+ nome +", bem vindo ao mundo JAVA!");

//      ESTRUTURA DE CONTROLE
//      ################################################################
//      Estrutura IF ... ELSE ...

//        if(idade > 18){
//            System.out.println("Pessoa MAIOR de idade");
//        }else{
//            System.out.println("Pessoa MENOR de idadde");
//        }
//
//        if (stado){
//            System.out.println("Acesso AUTORIZADO");
//        }else{
//              System.out.println("Acesso NEGADO");
//        }

//      ------------------------------------------------------
//      Estrutura While

//        int i = 0;

//        // Iterando sobre a string
//        while (i < nome.length()) {
//            System.out.println("Caractere na posição " + i + ": " + nome.charAt(i));
//            i++;
//        }
//
//        System.out.println("A String tem " + i + " caracteres");

//      ------------------------------------------------------
//      Estrutura For

//        String meunome = "Carlos Andre";
//
//        for (int i = 0; i < meunome.length(); i++) {
//            char caractere = meunome.charAt(i);
//            System.out.println("Caractere na posição " + i + ": " + caractere);
//        }

//        for (char caractere : meunome.toCharArray()) {
//            System.out.println("Caractere: " + caractere);
//        }
//        System.out.println("A String tem " + meunome.length() + " caracteres");

    }

}
