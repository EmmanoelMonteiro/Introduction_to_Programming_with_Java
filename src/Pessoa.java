import java.util.Scanner;

public class Pessoa {
    String nome;
    String idade;

    public Pessoa(String nome, String idade){
        this.nome = nome;
        this.idade = idade;

        System.out.println("Iniciando classe Pessoa ...");
    }

    public void pintNascimento(){
        int anoNascimento = 2025 - Integer.parseInt(this.idade);
        System.out.println(this.nome + " nasceu em " + anoNascimento);
    }

    public void printValidaIdade(){
        boolean adulto = false;
        if(Integer.parseInt(this.idade) >= 18){
            adulto = true;
        }
        System.out.println("Adulto? " + adulto);
    }
}