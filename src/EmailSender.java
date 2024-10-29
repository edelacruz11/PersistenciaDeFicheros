import java.io.*;

public class EmailSender extends MainteinerInfo {
    int bugID;

    public EmailSender(int bugID, String mailMaintainer, String nameMainteiner, String packageName) {
        super(mailMaintainer , nameMainteiner, packageName);
        this.bugID = bugID;
    }

    public void sendMail() {
        File f = new File("emailMainteiner.txt");
        try (FileWriter fw = new FileWriter(f)) {

            fw.write("From: owner@bugs.debian.org\n" +
                    "To: " + super.mailMaintainer + "\n" +
                    "Dear " + super.nameMainteiner + "\n" +
                    "You have a new bug: \n" +
                    super.packageName + " RC bug number #" + this.bugID + "\n" +
                    "Please, fix it as soon as possible.\n" +
                    "Cheers.");

        } catch (IOException e) {
            System.out.println("Ha habido un error: " + e.getMessage());
        }



        /*
        Esto no va aqui, va en la clase MainteinerInfo para ver si 'existe' el codigo de error
        pasado por parametro

        ---REPASAR---


        try (FileReader fr = new FileReader(f);
             BufferedReader br = new BufferedReader(fr)) {
            //Codigo aqui

        } catch (IOException e) {
            System.out.println("Error leyendo el fichero: " + e.getMessage());
        }
         */
    }

    @Override
    public String toString() {
        return "From: owner@bugs.debian.org\n" +
                "To: " + super.mailMaintainer + "\n" +
                "Dear " + super.nameMainteiner + "\n" +
                "You have a new bug: \n" +
                super.packageName + " RC bug number #" + this.bugID + "\n" +
                "Please, fix it as soon as possible.\n" +
                "Cheers.";
    }
}
