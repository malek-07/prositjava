public class ZooManagement {

    private String zooName;
    private int numberOfCages;

    public void setZooName(String name) {
        if (name != null && !name.isEmpty()) {
            this.zooName = name;
        } else {
            System.out.println("Nom de zoo invalide.");
        }
    }

    public String getZooName() {
        return zooName;
    }

    public void setNumberOfCages(int n) {
        if (n > 0) {
            this.numberOfCages = n;
        } else {
            System.out.println("Invalide. Entrez un nombre positive de cages");
        }
    }

    public int getNumberOfCages() {
        return numberOfCages;
    }
}
