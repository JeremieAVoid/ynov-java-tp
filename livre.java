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

    public String getTitre() {
        return titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public int getIdentifiant() {
        return identifiant;
    }
    public boolean isDisponible() {
        return disponible;
    }

    
}
