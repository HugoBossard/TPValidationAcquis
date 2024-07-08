public class Maison extends Batiment implements Habitable {
    private int nbPieces;

    public Maison() {
        super();
        this.nbPieces = 0;
    }

    public Maison(String adresse, int nbPieces) {
        super(adresse);
        this.nbPieces = nbPieces;
    }

    @Override
    public void occuper(int nombrePersonnes) {
        System.out.printf("Cette maison est maintenant occupée par %d personnes \n", nombrePersonnes);
    }

    public int getNbPieces() {
        return nbPieces;
    }

    public void setNbPieces(int nbPieces) {
        this.nbPieces = nbPieces;
    }
}