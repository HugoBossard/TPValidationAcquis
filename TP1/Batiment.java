public class Batiment {
    private String adresse;
    private static int nbBatiments = 0;

    public Batiment(String adresse) {
        this.adresse = adresse;
        nbBatiments ++;
    }

    public Batiment() {
        nbBatiments ++;
    }

    public static int getNombreTotalDeBatiments() {
        return nbBatiments;
    }

    public String getAdresse() {
        return adresse;
    }

    public static int getNbBatiments() {
        return nbBatiments;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void afficherInformation() {
        System.out.printf("La bâtiment est à l'adresse : %s \n", adresse);
    }
}