public class livre {
    private String titre;
    private String auteur;
    private int identifiant;
    private boolean disponible;

    public Livre(String titre, String auteur, int identifiant) {
        this.titre = titre;
        this.auteur = auteur;
        this.identifiant = identifiant;
        this.disponible = true;
    }
}
