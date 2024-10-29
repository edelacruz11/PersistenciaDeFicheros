import javax.swing.text.html.parser.Parser;

public class Main {
    public static void main(String[] args) {

        String bugEntrada = "125478";//args[0];
        int bugID =  Integer.parseInt(bugEntrada);

        EmailSender es = new EmailSender(bugID ,"ejemplo@gmail.com", "Pepe", "error4");

        es.sendMail();
    }
}
