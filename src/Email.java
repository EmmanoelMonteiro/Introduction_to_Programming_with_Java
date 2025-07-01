import java.util.Dictionary;

public class Email {

    String assunto, oriegem, destino, mensagem;

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getOriegem() {
        return oriegem;
    }

    public void setOriegem(String oriegem) {
        this.oriegem = oriegem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void send(){
        System.out.println("Enviando o e-mal ...");
    }

    public void receiving(){
        System.out.println("Recebendo o e-mal ...");
    }

   public void bildMensager(){
        String vEmail = "";

       vEmail = vEmail + " Origem: "+ this.oriegem + "\n";
       vEmail = vEmail + " Destino: "+ this.destino + "\n";
       vEmail = vEmail + " Assunto: "+ this.assunto + "\n";
       vEmail = vEmail + " Mensagem: "+ this.assunto;

       System.out.println("Montando e-mail ...");
       System.out.println("##################################");
       System.out.println(vEmail);
       System.out.println("##################################");
   }

    public static void main(String args[]){
        Email email = new Email();

        email.oriegem = "carlos@gmail.com";
        email.destino = "joana@gmail.com";
        email.assunto = "Primeiro contato";
        email.mensagem = "Estou precisando falar com você ....";

        email.bildMensager();
        email.send();
        email.receiving();
    }

}
