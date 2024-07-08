public class Test {
    public static void main(String[] args) {
        Batiment boulangerie = new Batiment("2 Rue des patates");
        Maison maisonDesGensLaBas = new Maison();
        Maison maisonDesGensIci = new Maison("54 Rue des portes", 4);

        System.out.println(boulangerie.getAdresse());
        maisonDesGensLaBas.afficherInformation();
        maisonDesGensIci.occuper(4);
        maisonDesGensLaBas.setAdresse("36 Boulevard des Capucines");
        maisonDesGensLaBas.afficherInformation();
    }
}