public class MainteinerInfo {
    String mailMaintainer;
    String nameMainteiner;
    String packageName;

    public MainteinerInfo(String mailMaintainer, String nameMainteiner, String packageName) {
        this.mailMaintainer = mailMaintainer;
        this.nameMainteiner = nameMainteiner;
        this.packageName = packageName;
    }

    public String getMailMaintainer() {
        return mailMaintainer;
    }

    public void setMailMaintainer(String mailMaintainer) {
        this.mailMaintainer = mailMaintainer;
    }

    public String getNameMainteiner() {
        return nameMainteiner;
    }

    public void setNameMainteiner(String nameMainteiner) {
        this.nameMainteiner = nameMainteiner;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
}
